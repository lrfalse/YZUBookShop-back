package test;

import dao.BuyDao;
import dao.SellingDao;
import dto.SearchConditions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xmfy on 2018/1/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class BannerTest {
    @Autowired
    SellingDao sellingDao;

    @Autowired
    BuyDao buyDao;

    @Test
    public void run(){
        SearchConditions conditions = new SearchConditions();
        conditions.setType("title");
        conditions.setValue("");
        conditions.setC1(7);
        conditions.setC2(71);
        conditions.setMin(0);
        conditions.setMax(200);
        conditions.setSort(0);
        conditions.setAccount("test001");
        System.out.println(buyDao.queryBooksByMultiConditions(conditions));
    }
}
