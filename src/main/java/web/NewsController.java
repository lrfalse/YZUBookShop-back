package web;

import entity.Carousel;
import entity.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CarouselService;
import service.NewsService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/4.
 */
@Controller
public class NewsController {

    @Autowired
    CarouselService carouselService;

    @Autowired
    NewsService newsService;

    @RequestMapping(value = "/banner", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData getBanners(@Param("size") int size){
        List<Carousel> carouselList = carouselService.getCarouselsBySize(size);
        return carouselList==null ? new FormedData<>(false, "轮播数据不存在") : new FormedData<>(true, carouselList);
    }

    @RequestMapping(value = "/news", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public FormedData getNews(@Param("size") int size){
        List<News> newsList = newsService.getNewsBySize(size);
        return newsList==null ? new FormedData<>(false, "资讯列表不存在") : new FormedData<>(true, newsList);
    }
}
