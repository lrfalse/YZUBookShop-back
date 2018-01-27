package service;

import dto.Book;
import dto.SellingDto;
import entity.Selling;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/22.
 */
public interface SellingService {

    FormedData<List<Selling>> queryByAccount(String account);

    FormedData<Integer> updateSelling(SellingDto selling);

    FormedData<Integer> deleteSellingById(int id);

    FormedData<Integer> addSelling(SellingDto selling, CommonsMultipartFile[] files);

    FormedData<List<Book>> queryBookFuzzy(String text, int size, int c1, int c2);
}
