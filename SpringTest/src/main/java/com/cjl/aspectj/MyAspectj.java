package com.cjl.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspectj {

    @Before(value = "execution(public void com.cjl.aspectj.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore() {
        System.out.println("切面功能：在目标方法之前输出时间：" + new Date());
    }
}
