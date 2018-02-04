package dao;

import entity.Delivery;
import org.apache.ibatis.annotations.Param;

/**
 * Created by xmfy on 2018/2/3.
 */
public interface OrderDao {

    int validBook(@Param("buyer") String buyer, @Param("bookIds") String bookIds);

    int insertOrders(@Param("buyer") String buyer, @Param("seller") String seller, @Param("bookId") int bookId, @Param("delivery")Delivery delivery);
}
