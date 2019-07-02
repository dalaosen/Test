package cn.dls.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserControllerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getUserName() {
        UserController userController = new UserController();
        String userName = userController.getUserName(0001);
        System.out.println(userName);
    }
}