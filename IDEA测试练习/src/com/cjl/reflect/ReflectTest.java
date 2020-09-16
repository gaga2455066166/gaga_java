package com.cjl.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) {
        //可以执行创建任意类的对象，和方法
        Properties properties = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        try {
            Class cls = Class.forName(className);
            Object obj = cls.newInstance();
            Method method = cls.getMethod(methodName);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
