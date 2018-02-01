package service;

import entity.Cart;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/2/1.
 */
public interface CartService {

    int insertCart(Cart cart);

    FormedData<List<Cart>> queryByAccount(String buyer);

    int deleteById(int id);
}
