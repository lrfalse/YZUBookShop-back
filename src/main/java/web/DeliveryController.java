package web;

import entity.Delivery;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DeliveryService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/16.
 */
@Controller
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping(value = "/getDeliveries", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Delivery>> getDeliveries(@Param("account") String account){
        return deliveryService.getDeliveryList(account);
    }

    @RequestMapping(value = "/setDefaultLocation", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<Integer> setDefaultLocation(@Param("id") int id, @Param("account") String account){
        return deliveryService.setDefaultLocation(id, account);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Delivery>> addNewDelivery(@ModelAttribute("delivery") Delivery delivery){
        return deliveryService.addNewDelivery(delivery);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Delivery>> deleteDeliveryById(@Param("id") int id){
        return deliveryService.deleteDeliveryById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData<List<Delivery>> updateDeliveryById(@ModelAttribute("delivery") Delivery delivery){
        System.out.println("---------"+delivery);
        return deliveryService.updateDelivery(delivery);
    }

}
