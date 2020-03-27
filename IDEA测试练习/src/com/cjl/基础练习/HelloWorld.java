package com.cjl.基础练习;

class Person
{ static String country="A城市" ;
}
public class HelloWorld{
        public static void main(String args[])
        {
            Person p1=new Person();
            Person p2=new Person();
            p1.country="B城市";
            p2.country="C城市";
            System.out.println(p1.country);
            System.out.println(p2.country);
        }
}