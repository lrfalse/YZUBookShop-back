package service;

import dto.CartCollection;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/2/4.
 */
public interface OrderService {
    FormedData<Integer> validBooks(String account, String bookIds);

    FormedData<Integer> insertOrders(String account, List<CartCollection> CartCollections);
}
