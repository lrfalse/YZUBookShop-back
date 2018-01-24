package service.impl;

import dao.SellingDao;
import dto.SellingDto;
import entity.Selling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import service.SellingService;
import tool.FormedData;
import tool.ImageSaver;

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

    @Override
    public FormedData<Integer> deleteSellingById(int id) {
        int result = sellingDao.deleteSellingById(id);
        return result == 0 ? new FormedData<>(false, "数据库繁忙") : new FormedData<>(true, 1);
    }

    @Override
    @Transactional
    public FormedData<Integer> addSelling(SellingDto selling, CommonsMultipartFile[] files) {
        int result = sellingDao.addSelling(selling);
        int results = ImageSaver.saveMultiPhotos(files,System.getProperty("project.root") + "/resources/selling/" + selling.getAccount());
        if (result == 1 && results == files.length)
            return new FormedData<>(true, results);
        return new FormedData<>(false, "数据库繁忙");
    }
}
