package service.impl;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;
import tool.FormedData;

/**
 * Created by xmfy on 2018/1/13.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;

    @Override
    @Transactional
    public int updateUser(String key, String value, String account) {
        return dao.updateUser(key, value, account);
    }

    @Override
    public int registerUser(User user) {
        return dao.insertUser(user);
    }

    @Override
    public FormedData<User> loginUser(String account, String pwd) {
        User user = dao.selectUser(account, pwd);
        return user==null?new FormedData<>(false, "账号或密码不正确") : new FormedData<User>(true, user);
    }


}
