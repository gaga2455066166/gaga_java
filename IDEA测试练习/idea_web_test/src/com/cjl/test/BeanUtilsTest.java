package com.cjl.test;

import com.cjl.domain.User;
import org.junit.Test;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {
    @Test
    public void test(){
        User user = new User();
        try {
            BeanUtils.setProperty(user,"username","张三");
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(user);
        try {
            String username = BeanUtils.getProperty(user, "username");
            System.out.println(username);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
