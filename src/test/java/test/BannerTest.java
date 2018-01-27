package test;

import dao.BuyDao;
import dao.SellingDao;
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
        System.out.println(buyDao.getBookSuggestion("title", "杂货", 5 , 1 ,11));
    }
}
