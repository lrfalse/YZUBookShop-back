package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by xmfy on 2018/1/13.
 */
public interface UserDao {

    int updateUser(@Param("key") String key, @Param("value") String value, @Param("account") String account);

    int insertUser(@Param("user") User user);

    User selectUser(@Param("account")String account, @Param("pwd") String pwd);
}
