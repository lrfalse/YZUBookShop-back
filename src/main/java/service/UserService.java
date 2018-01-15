package service;

import entity.User;
import tool.FormedData;

/**
 * Created by xmfy on 2018/1/13.
 */
public interface UserService {

    int updateUser(String key, String value, String account);

    int registerUser(User user);

    FormedData<User> loginUser(String account, String pwd);
}
