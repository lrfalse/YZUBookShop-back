package web;

import entity.Selling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CollectService;
import dto.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/30.
 */
@Controller
@RequestMapping("collect")
public class CollectController {

    @Autowired
    private CollectService collectService;

    @RequestMapping(value = "/change", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public int collectChange(@RequestParam("account") String account, @RequestParam("bookId") int bookId, @RequestParam("method") String method){
        return collectService.changeCollection(account, bookId, method);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Selling>> queryCollections(@RequestParam("account") String account){
        return collectService.queryCollections(account);
    }
}
