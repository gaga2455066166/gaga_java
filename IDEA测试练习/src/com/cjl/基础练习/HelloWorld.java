package com.cjl.基础练习;

class Person
{ static String country="A城市" ;
}
public class HelloWorld{
        public static void main(String args[])
        {
            String str = new String("ssss");
            String str0 = new String("ssss");
            System.out.println(str == str0);
            System.out.println(str.equals(str0));
            String str3;
            String str4;
            str3 = "ssss";
            str4 = "ssss";
            System.out.println(str3 == str4);
            System.out.println(str3.equals(str4));

        }
}