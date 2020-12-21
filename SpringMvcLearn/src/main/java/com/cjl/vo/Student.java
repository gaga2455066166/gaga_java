package com.cjl.vo;

import lombok.Data;

@Data
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("Student的无参数的构造方法。");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("SetName");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("SetAge");
    }
}
