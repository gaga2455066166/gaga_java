package com.cjl;

import com.cjl.aspectj.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectj {
    @Test
    public void Test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ctx.getBean("someService");
        proxy.doSome("张三", 20);
    }
}
