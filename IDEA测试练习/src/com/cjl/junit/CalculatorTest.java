package com.cjl.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void init() {
        System.out.println("初始化完成");
    }

    @After
    public void close() {
        System.out.println("程序结束");
    }

    @Test
    public void testsumxy() {
        Calculator c = new Calculator();
        int s = c.sumxy(1, 2);
        System.out.println(s);
    }

    @Test
    public void testsumxy2() {
        Calculator c = new Calculator();
        int s = c.sumxy(3, 2);
        System.out.println(s);
        Assert.assertEquals(5, s);//断言
    }
    
}
