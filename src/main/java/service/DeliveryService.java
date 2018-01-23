package service;

import entity.Delivery;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/16.
 */
public interface DeliveryService {

    FormedData<List<Delivery>> getDeliveryList(String account);

    FormedData<List<Delivery>> setDefaultLocation(int id, String account);

    FormedData<List<Delivery>> addNewDelivery(Delivery delivery);

    FormedData<List<Delivery>> deleteDeliveryById(int id);

    FormedData<List<Delivery>> updateDelivery(Delivery delivery);
}