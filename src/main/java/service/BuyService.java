package service;

import dto.BookSearchBean;
import dto.BookSuggestion;
import dto.SearchConditions;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/27.
 */
public interface BuyService {
    FormedData<List<BookSuggestion>> getBookSuggestion(String value, int size, int c1, int c2);

    FormedData<List<BookSearchBean>> queryBooksByType(String type, String value, String account);

    FormedData<List<BookSearchBean>> queryBooks(SearchConditions conditions);
}
