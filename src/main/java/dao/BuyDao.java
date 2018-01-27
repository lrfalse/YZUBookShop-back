package dao;

import dto.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xmfy on 2018/1/27.
 */
public interface BuyDao {

    List<String> getBookSuggestion(@Param("type") String type, @Param("value")String value, @Param("size")int size, @Param("c1")int c1, @Param("c2")int c2);

    List<Book> getBooksByType(@Param("type") String type, @Param("value")String value);

    List<Book> selectBooksFuzzy(@Param("text") String text, @Param("size") int size, @Param("c1")int c1, @Param("c2")int c2);

}
