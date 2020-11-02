package com.cjl.aspectj;

public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {
        System.out.println("这个是目标方法！");
    }
}
