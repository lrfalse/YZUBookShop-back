package service.impl;

import dao.CartDao;
import entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CartService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/2/1.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public int insertCart(Cart cart) {
        return cartDao.insertCart(cart);
    }

    @Override
    public FormedData<List<Cart>> queryByAccount(String buyer) {
        List<Cart> carts = cartDao.queryByAccount(buyer);
        if (carts.size() == 0)
            return new FormedData<>(false, "您尚未添加书籍至购物车!");
        return new FormedData<>(true, carts);
    }

    @Override
    public int deleteById(int id) {
        return cartDao.deleteCartById(id);
    }
}
