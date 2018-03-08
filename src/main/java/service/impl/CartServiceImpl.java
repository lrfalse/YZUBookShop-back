package service.impl;

import dao.CartDao;
import dto.CartCollection;
import entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CartService;
import dto.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/2/1.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public FormedData<Integer> insertCart(Cart cart) {
        int col = cartDao.checkIfExist(cart.getBookId(), cart.getBuyer());
        if (col != 0)
            return new FormedData<>(false, "请勿重复购买！");
        int res = cartDao.insertCart(cart);
        if (res == 0)
            return new FormedData<>(false, "数据库出错，请稍后再试！");
        return new FormedData<>(true, res);
    }

    @Override
    public FormedData<List<CartCollection>> queryByAccount(String buyer) {
        List<CartCollection> carts = cartDao.queryCart(buyer);
        if (carts.size() == 0)
            return new FormedData<>(false, "您尚未添加书籍至购物车!");
        return new FormedData<>(true, carts);
    }

    @Override
    public int deleteById(int id) {
        return cartDao.deleteCartById(id);
    }

    @Override
    public FormedData<Integer> queryBookCount(String buyer) {
        int res = cartDao.queryBooksCount(buyer);
        return new FormedData<>(true, res);
    }
}
