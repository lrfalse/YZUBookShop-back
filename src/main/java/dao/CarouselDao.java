package dao;

import entity.Carousel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xmfy on 2018/1/4.
 */
public interface CarouselDao {

    List<Carousel> getCarouselsBySize(@Param("size") Integer size);
}
