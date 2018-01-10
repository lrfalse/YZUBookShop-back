package service;

import entity.Carousel;

import java.util.List;

/**
 * Created by xmfy on 2018/1/4.
 */
public interface CarouselService {


    /**
     *
     * @param size 轮播图片数量
     * @return 轮播图片的属性
     */
    List<Carousel> getCarouselsBySize(int size);

}
