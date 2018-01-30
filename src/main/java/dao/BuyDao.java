package dao;

import dto.BookSearchBean;
import dto.SearchConditions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xmfy on 2018/1/27.
 */
public interface BuyDao {

    List<String> getBookSuggestion(@Param("type") String type, @Param("value")String value, @Param("size")int size, @Param("c1")int c1, @Param("c2")int c2);

    List<BookSearchBean> getBooksByType(@Param("type") String type, @Param("value")String value, @Param("account") String account);

    int viewsAdd(Integer[] ids);

    int singleViewAdd(@Param("id") int id);

    List<BookSearchBean> queryBooks(@Param("conditions")SearchConditions conditions);

    List<BookSearchBean> fuzzyQueryBooks(@Param("text") String text, @Param("size") int size, @Param("c1")int c1, @Param("c2")int c2, @Param("acount") String account);
}
