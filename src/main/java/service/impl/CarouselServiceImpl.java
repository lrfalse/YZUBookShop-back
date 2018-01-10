package service.impl;

import dao.CarouselDao;
import entity.Carousel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CarouselService;

import java.util.List;

/**
 * Created by xmfy on 2018/1/4.
 */
@Service
public class CarouselServiceImpl implements CarouselService{

    @Autowired
    private CarouselDao carouselDao;

    @Override
    public List<Carousel> getCarouselsBySize(int size) {
        return carouselDao.getCarouselsBySize(size);
    }

}
