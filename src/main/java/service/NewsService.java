package service;

import entity.News;

import java.util.List;

/**
 * Created by xmfy on 2018/1/10.
 */
public interface NewsService {

    /**
     *
     * @param size 新闻条数
     * @return 返回新闻列表
     */
    List<News> getNewsBySize(int size);
}
