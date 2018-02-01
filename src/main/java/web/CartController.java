package web;

import entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.CartService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/2/1.
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/queryBuyAccount", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Cart>> queryBooks(@RequestParam("buyer") String buyer){
        return cartService.queryByAccount(buyer);
    }

    @RequestMapping(value = "/insertCart", method = RequestMethod.POST)
    @ResponseBody
    public int insertCart(@ModelAttribute("cart") Cart cart){
        return cartService.insertCart(cart);
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    @ResponseBody
    public int deleteById(@RequestParam("id") int id){
        return cartService.deleteById(id);
    }
}
