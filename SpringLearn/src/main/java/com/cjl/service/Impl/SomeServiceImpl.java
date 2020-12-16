package com.cjl.service.Impl;

import com.cjl.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void doSome() {
        System.out.println("doSome" + a);
    }
}
