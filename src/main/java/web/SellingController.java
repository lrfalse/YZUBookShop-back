package web;

import dto.SellingDto;
import entity.Selling;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SellingService;
import tool.FormedData;

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

}
