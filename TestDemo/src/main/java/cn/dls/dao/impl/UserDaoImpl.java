package cn.dls.dao.impl;

import cn.dls.dao.UserDao;
import cn.dls.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    List<User> users = null;

    public UserDaoImpl() {
        User zhangsan = new User(0001, "张三");
        User lisi = new User(0002, "李四");
        User wangwu = new User(0003, "王五");
        users = new ArrayList<User>();
        users.add(zhangsan);
        users.add(lisi);
        users.add(wangwu);
    }

    public String getUserName(int userId) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (userId == user.getUserId()) {
                return user.getUserName();
            }
        }
        return null;
    }
}
