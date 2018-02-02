package dao;

import dto.CartCollection;
import entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xmfy on 2018/1/13.
 */
public interface CartDao {

    int insertCart(@Param("cart")Cart cart);

    List<Cart> queryByAccount(@Param("buyer")String buyer);

    int deleteCartById(@Param("id") int id);

    int checkIfExist(@Param("bookId") int bookId, @Param("buyer") String buyer);

    List<CartCollection> queryCart(@Param("buyer")String buyer);

    int queryBooksCount(@Param("buyer")String buyer);
}
