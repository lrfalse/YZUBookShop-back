package dao;

import entity.Selling;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xmfy on 2018/1/13.
 */
public interface CollectDao {

    int addNewCollection(@Param("account") String account, @Param("book") int bookId);

    int deleteCollection(@Param("account") String account, @Param("book") int bookId);

    List<Selling> queryCollections(@Param("account") String account);

}
