package dao;

import entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xmfy on 2018/1/10.
 */
public interface NewsDao {
    List<News> getNewsBySize(@Param("size") Integer size);
}
