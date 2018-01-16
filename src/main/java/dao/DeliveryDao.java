package dao;

import entity.Delivery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xmfy on 2018/1/16.
 */
public interface DeliveryDao {

    List<Delivery> getDeliveryList(@Param("account") String account);

    Integer setDefaultTrue(@Param("id") int id);

    Integer setDefaultFalse(@Param("id") int id, @Param("account") String account);
}
