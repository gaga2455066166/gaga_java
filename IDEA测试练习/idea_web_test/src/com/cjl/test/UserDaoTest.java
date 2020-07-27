package com.cjl.test;

import com.cjl.dao.UserDao;
import com.cjl.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin(){
        User loginUser = new User();
        loginUser.setUsername("2455");
        loginUser.setPassword("12456");

        UserDao dao = new UserDao();
        User user = dao.login(loginUser);
        System.out.println(user);
    }
}
