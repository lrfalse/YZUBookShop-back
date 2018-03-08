package service;

import entity.Selling;
import dto.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/30.
 */
public interface CollectService {
    int changeCollection(String account, int bookId, String method);

    FormedData<List<Selling>> queryCollections(String account);
}
