package cn.dls.service.impl;

import cn.dls.dao.UserDao;
import cn.dls.dao.impl.UserDaoImpl;
import cn.dls.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public String getUserName(int userId) {
        userDao = new UserDaoImpl();
        return userDao.getUserName(userId);
    }
}
