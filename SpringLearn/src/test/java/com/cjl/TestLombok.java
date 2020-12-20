package com.cjl;

import org.junit.Test;

public class TestLombok {
    @Test
    public void TestMethod1(){
        Person person = new Person();
        person.setId(12);
        person.setName("Person");
        System.out.println(person.toString());
    }
}
