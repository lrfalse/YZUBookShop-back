package web;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;
import tool.FormedData;

/**
 * Created by xmfy on 2018/1/13.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public int registerUser(@ModelAttribute("user") User user){
        System.out.println("注册用户: "+user);
        return userService.registerUser(user);
    }

    @RequestMapping(value = "login", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData loginUser(@Param("account") String account, @Param("pwd") String pwd){
        FormedData data = userService.loginUser(account, pwd);
        System.out.println(data);
        return data;
    }
}
