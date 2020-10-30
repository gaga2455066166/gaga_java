package com.cjl;

import com.cjl.service.Impl.SomeServiceImpl;
import com.cjl.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void TestSomeService(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void TestBeans(){
        //di：依赖注入
        String config = "applicationContext.xml";

        //创建spring容器时，会创建配置文件中的所有的对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("someService");
        service.doSome();
    }

    @Test
    public void TestBeans2(){
        //di：依赖注入
        String config = "applicationContext.xml";

        //创建spring容器时，会创建配置文件中的所有的对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int counts = ac.getBeanDefinitionCount();
        System.out.println(counts);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
