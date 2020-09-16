package com.cjl.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "com.cjl.reflect.Student",methodName = "eat")
public class ReflectTest2 {
    public static void main(String[] args) {
        //可以执行创建任意类的对象，和方法
        Class<ReflectTest2> reflectTest2Class = ReflectTest2.class;
        Pro annotation = reflectTest2Class.getAnnotation(Pro.class);
        String className = annotation.className();
        String methodName = annotation.methodName();
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
