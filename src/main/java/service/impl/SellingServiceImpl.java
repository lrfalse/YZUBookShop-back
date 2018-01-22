package service.impl;

import dao.SellingDao;
import dto.SellingDto;
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

    @Override
    public FormedData<Integer> updateSelling(SellingDto selling) {
        int result = sellingDao.updateSelling(selling);
        if (result == 0)
            return new FormedData<>(false, "数据库繁忙");
        else{
            return new FormedData<>(true, result);
        }
    }
}
