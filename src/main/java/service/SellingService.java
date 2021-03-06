package service;

import dto.SellingDto;
import entity.Selling;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import dto.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/22.
 */
public interface SellingService {

    FormedData<List<Selling>> queryByAccount(String account);

    FormedData<Integer> updateSelling(SellingDto selling);

    FormedData<Integer> deleteSellingById(int id);

    FormedData<Integer> addSelling(SellingDto selling, CommonsMultipartFile[] files);
}
