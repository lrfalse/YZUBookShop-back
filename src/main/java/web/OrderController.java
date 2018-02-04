package web;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dto.CartCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.OrderService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/2/4.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/valid", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<Integer> validOrder(@RequestParam("account") String account, @RequestParam("bookIds") String bookIds){
        return orderService.validBooks(account, bookIds);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<Integer> insertOrder(@RequestParam("account") String account, @RequestParam("cartCollections") String s){
        List<CartCollection> cartCollections = new Gson().fromJson(s, new TypeToken<List<CartCollection>>(){}.getType());
        System.out.println(account + ":" + cartCollections.toString());
        return orderService.insertOrders(account, cartCollections);
    }
}
