package service;

import dto.Book;
import dto.BookSuggestion;
import dto.SearchConditions;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/27.
 */
public interface BuyService {
    FormedData<List<BookSuggestion>> getBookSuggestion(String value, int size, int c1, int c2);

    FormedData<List<Book>> getBooksByType(String type, String value);

    FormedData<List<Book>> queryBookFuzzy(String text, int size, int c1, int c2);

    FormedData<List<Book>> queryByMultiConditions(SearchConditions conditions);
}
