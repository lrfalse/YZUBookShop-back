package service.impl;

import dao.SellingDao;
import entity.Selling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SellingService;
import tool.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/22.
 */
@Service
public class SellingServiceImpl implements SellingService{

    @Autowired
    private SellingDao sellingDao;

    @Override
    public FormedData<List<Selling>> queryByAccount(String account) {
        List<Selling> data = sellingDao.queryByAccout(account);
        if (data != null)
            return new FormedData<>(true, data);
        return new FormedData<>(false, "数据库繁忙");
    }
}
