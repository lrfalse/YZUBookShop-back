package service.impl;

import dao.CartDao;
import dao.DeliveryDao;
import dao.OrderDao;
import dao.SellingDao;
import dto.BookInfo;
import dto.CartCollection;
import entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/2/4.
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CartDao cartDao;

    @Autowired
    private SellingDao sellingDao;

    @Autowired
    private DeliveryDao deliveryDao;

    @Override
    public FormedData<Integer> validBooks(String account, String bookIds) {
        int res = orderDao.validBook(account, bookIds);
        if (res > 0){
            cartDao.deleteByBuyerBookId(account, bookIds);
            return new FormedData<>(false, "当前有" + res + "本图书已经下架! 请再次提交订单!");
        }
        return new FormedData<>(true, 0);
    }

    @Override
    public FormedData<Integer> insertOrders(String account, List<CartCollection> cartCollections) {
        Delivery delivery = deliveryDao.getDefaultDelivery(account);
        int rs = 0;
        for (CartCollection c : cartCollections){
            for (BookInfo bookInfo : c.getBooks())
                rs += orderDao.insertOrders(account, c.getSellerId(), bookInfo.getBookId(), delivery);
        }
        return rs > 0 ? new FormedData<>(true, rs) : new FormedData<>(false, "数据库错误，请稍后再试！");
    }


}
