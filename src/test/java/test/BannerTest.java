package test;

import org.junit.Test;
import service.CarouselService;
import service.impl.CarouselServiceImpl;

/**
 * Created by xmfy on 2018/1/4.
 */
public class BannerTest {

    @Test
    public void run(){
        CarouselService carouselService = new CarouselServiceImpl();
        System.out.println(carouselService.getCarouselsBySize(2));
    }
}
