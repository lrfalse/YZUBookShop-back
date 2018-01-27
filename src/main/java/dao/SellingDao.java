package dao;

import dto.Book;
import dto.SellingDto;
import entity.Selling;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xmfy on 2018/1/22.
 */
public interface SellingDao {

    List<Selling> queryByAccout(@Param("account") String account);

    int updateSelling(@Param("s")SellingDto s);

    int deleteSellingById(@Param("id") int id);

    int addSelling(@Param("s")SellingDto s);

    List<Book> selectBooksFuzzy(@Param("text") String text, @Param("size") int size, @Param("c1")int c1, @Param("c2")int c2);
}
