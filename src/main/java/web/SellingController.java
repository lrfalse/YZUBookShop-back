package web;

import dto.Book;
import dto.SellingDto;
import entity.Selling;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import service.SellingService;
import tool.FormedData;
import tool.ImageSaver;

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
        int res = ImageSaver.saveMultiPhotos(files, dirPath);
        return res == 0 ? new FormedData<>(false, "服务器繁忙") : new FormedData<Integer>(true, res);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<Integer> deleteSelling(@Param("id") int id){
        return sellingService.deleteSellingById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, headers = ("content-type=multipart/*"), produces = {"application/json;charset=UTF-8"}, consumes = "file/*")
    @ResponseBody
    public FormedData<Integer> addSelling(@RequestParam("img")CommonsMultipartFile[] files, @ModelAttribute("selling") SellingDto sellingDto){
        return sellingService.addSelling(sellingDto, files);
    }

    @RequestMapping(value = "/fuzzyQuery", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Book>> addSelling(@RequestParam("text") String text, @RequestParam("size") int size, @RequestParam("category1") Integer c1, @RequestParam("category2") Integer c2){
        System.out.println(text + size + c1 + c2);
        return sellingService.queryBookFuzzy(text, size, c1, c2);
    }

}
