package test;

import dao.CartDao;
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
    CartDao dao;

    @Test
    public void run(){
        System.out.println(dao.queryCart("test001"));
    }
}
