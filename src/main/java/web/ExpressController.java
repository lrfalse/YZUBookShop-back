package web;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dto.CartCollection;
import dto.FormedData;
import dto.OrderCollection;
import dto.SellerOrderCollection;
import entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.ExpressService;
import service.OrderService;

import java.util.List;

/**
 * Created by xmfy on 2018/2/4.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    ExpressService expressService;

    @RequestMapping(value = "/buyer/submit", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<Integer> buyerSubmit(@ModelAttribute("delivery")Delivery delivery, @RequestParam("cartCollections")String cList){
        List<CartCollection> cartCollections = new Gson().fromJson(cList, new TypeToken<List<CartCollection>>(){}.getType());
        return orderService.buyerSubmit(delivery.getAccount(), delivery, cartCollections);
    }

    @RequestMapping(value = "/buyer/query", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<OrderCollection>> queryOrderByType(@RequestParam("account")String account, @RequestParam("flag")int flag){
        return orderService.getOrderCollection(account, flag);
    }

    @RequestMapping(value = "/buyer/pay", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<Integer> buyerPay(@RequestParam("ids[]")Integer[] ids, @RequestParam("seller")String seller, @RequestParam("buyer") String buyer, @RequestParam("price") float price){
        FormedData<Integer> data = orderService.pay(ids, seller, buyer, price);
        System.out.println(data);
        return data;
    }

    @RequestMapping(value = "/seller/query", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<SellerOrderCollection>> querySellerOrderByType(@RequestParam("account")String account, @RequestParam("flag")int flag){
        return orderService.getSellerOrderCollection(account, flag);
    }

    @RequestMapping(value = "/seller/updateFlag", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<Integer> querySellerOrderByType(@RequestParam("ids[]")Integer[] ids, @RequestParam("flag") int flag){
        return orderService.updateFlag(ids, flag);
    }


}
