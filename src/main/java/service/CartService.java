package service;

import dto.CartCollection;
import entity.Cart;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/2/1.
 */
public interface CartService {

    FormedData<Integer> insertCart(Cart cart);

    FormedData<List<CartCollection>> queryByAccount(String buyer);

    int deleteById(int id);

    FormedData<Integer> queryBookCount(String buyer);
}
