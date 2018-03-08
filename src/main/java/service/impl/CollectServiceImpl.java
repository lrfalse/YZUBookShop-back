package service.impl;

import dao.CollectDao;
import entity.Selling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CollectService;
import dto.FormedData;

import java.util.List;

/**
 * Created by xmfy on 2018/1/30.
 */
@Service
public class CollectServiceImpl implements CollectService{

    @Autowired
    private CollectDao collectDao;

    @Override
    public int changeCollection(String account, int bookId, String method) {
        if (method.equals("add")){
            collectDao.addNewCollection(account, bookId);
            return 1;
        }else if (method.equals("delete")){
            collectDao.deleteCollection(account,bookId);
            return 1;
        }
        return 0;
    }

    @Override
    public FormedData<List<Selling>> queryCollections(String account) {
        List<Selling> sList = collectDao.queryCollections(account);
        if (sList.size() == 0)
            return new FormedData<>(false, "您尚未收藏任何书籍!");
        return new FormedData<>(true, sList);
    }
}
