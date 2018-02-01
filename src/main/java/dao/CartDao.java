package dao;

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

}
