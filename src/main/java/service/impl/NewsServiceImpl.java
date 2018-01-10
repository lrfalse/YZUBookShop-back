package service.impl;

import dao.NewsDao;
import entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.NewsService;

import java.util.List;

/**
 * Created by xmfy on 2018/1/10.
 */
@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> getNewsBySize(int size) {
        return newsDao.getNewsBySize(size);
    }
}
