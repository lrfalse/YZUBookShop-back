package service.impl;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

/**
 * Created by xmfy on 2018/1/13.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;

    @Override
    public int registerUser(User user) {
        return dao.insertUser(user);
    }
}
