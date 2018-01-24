package test;

import org.junit.Test;

/**
 * Created by xmfy on 2018/1/4.
 */
public class BannerTest {

    @Test
    public void run(){
        String s = "/storage/emulated/0/Download/cover4.jpg";
        System.out.println(s.substring(s.lastIndexOf("/")));
    }
}
