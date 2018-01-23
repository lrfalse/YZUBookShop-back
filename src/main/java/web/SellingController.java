package web;

import dto.SellingDto;
import entity.Selling;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import service.SellingService;
import tool.FormedData;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by xmfy on 2018/1/22.
 */
@Controller
@RequestMapping("/selling")
public class SellingController {

    @Autowired
    private SellingService sellingService;

    @RequestMapping(value = "/query", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Selling>> queryByAccount(@Param("account")String account){
        return sellingService.queryByAccount(account);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<Integer> updateSelling(@ModelAttribute("Selling")SellingDto selling){
        return sellingService.updateSelling(selling);
    }

    @RequestMapping(value = "/uploadPhotos", method = RequestMethod.POST, headers = ("content-type=multipart/*"), produces = {"application/json;charset=UTF-8"}, consumes = "file/*")
    @ResponseBody
    public FormedData<Integer> uploadPhotos(@RequestParam("img")CommonsMultipartFile[] files, @RequestParam("account") String account){
        String dirPath= System.getProperty("project.root") + "/resources/selling/" + account;
        File dir = new File(dirPath);
        if (!dir.exists())
            dir.mkdir();
        for (CommonsMultipartFile file :files){
            try {
                if (new File(dirPath + "/" +file.getOriginalFilename()).exists())
                    continue;
                FileOutputStream fos = new FileOutputStream(dirPath + "/" +file.getOriginalFilename());
                InputStream is = file.getInputStream();
                int b;
                while ((b = is.read()) != -1){
                    fos.write(b);
                }
                fos.flush();
                is.close();
                fos.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("--------------更新图片---------------");
        return new FormedData<>(true, files.length);
    }

}
