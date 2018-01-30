package service.impl;

import dao.BuyDao;
import dto.BookSearchBean;
import dto.BookSuggestion;
import dto.SearchConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BuyService;
import tool.FormedData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by xmfy on 2018/1/27.
 */
@Service
public class BuyServiceImpl implements BuyService{

    @Autowired
    private BuyDao buyDao;

    @Override
    public FormedData<List<BookSuggestion>> getBookSuggestion(String value, int size, int c1, int c2) {
        List<BookSuggestion> bookSuggestionList = new ArrayList<>();
        for (String key : new String[]{"title", "author", "keywords"}){
            List<String> list = buyDao.getBookSuggestion(key, value, size-bookSuggestionList.size(), c1, c2);
            if (!list.isEmpty())
                bookSuggestionList.addAll(list.stream().map(s -> new BookSuggestion(key, s)).collect(Collectors.toList()));
            if (bookSuggestionList.size() == size)
                return new FormedData<>(true, bookSuggestionList);
        }
        if (bookSuggestionList.size() == 0)
            return new FormedData<>(false, "未找到相关书籍!");
        else
            return new FormedData<>(true, bookSuggestionList);
    }

    @Override
    public FormedData<List<BookSearchBean>> queryBooksByType(String type, String value, String account) {
        List<BookSearchBean> books = buyDao.getBooksByType(type, value, account);
        if (books.size() == 0)
            return new FormedData<>(false, "未找到相关书籍!");
        return new FormedData<>(true, books);
    }

    @Override
    public FormedData<List<BookSearchBean>> queryBooks(SearchConditions conditions) {
        List<BookSearchBean> books = buyDao.queryBooks(conditions);
        if (books.size() == 0)
            return new FormedData<>(false, "未找到相关书籍!");
        return new FormedData<>(true, books);
    }
}
