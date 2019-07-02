package cn.dls.controller;

import cn.dls.service.UserService;
import cn.dls.service.impl.UserServiceImpl;

public class UserController {

    private UserService userService;

    public String getUserName(int userId){
        userService = new UserServiceImpl();
        return userService.getUserName(userId);

    }
}
