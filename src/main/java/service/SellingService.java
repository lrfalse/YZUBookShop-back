package service;

import entity.Selling;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/22.
 */
public interface SellingService {
    FormedData<List<Selling>> queryByAccount(String account);
}
