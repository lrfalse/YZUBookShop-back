package service.impl;

import dao.DeliveryDao;
import entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DeliveryService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/16.
 */
@Service
public class DeliveryServiceImpl implements DeliveryService{

    @Autowired
    private DeliveryDao dao;

    @Override
    public FormedData<List<Delivery>> getDeliveryList(String account) {
        List<Delivery> deliveryList = dao.getDeliveryList(account);
        FormedData<List<Delivery>> data;
        if (deliveryList.size()==0)
            data = new FormedData<>(false, "请及时添加收货地址!");
        else
            data = new FormedData<>(true, deliveryList);
        return data;
    }

    @Override
    public FormedData<List<Delivery>> setDefaultLocation(int id, String account) {
        FormedData data = new FormedData(false, "数据库繁忙，请稍后再试!");
        if(dao.setDefaultTrue(id) == 0 || dao.setDefaultFalse(id, account) == 0)
            return data;
        return new FormedData<>(true, dao.getDeliveryList(account));
    }
}
