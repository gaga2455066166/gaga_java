package com.cjl.基础练习;

import java.util.Scanner;
import java.security.PublicKey;

public class test {
    public static void main(String[]arg){
        Scanner scanner=new Scanner(System.in);      //扫描从键盘输入的性别
        System.out.println("请输入您的性别：");
        String Input=scanner.next();                 //将性别赋给Input
        CheckSex checkSex=new CheckSex();            //实例化CheckSex方法
        try{                                         //在Main方法中试图捕获自定义异常
            checkSex.Check(Input);
        }catch (MyException e){
            e.printStackTrace();                      //输出自定义异常中的提示文字
        }
    }

}
class MyException extends  Exception{             //自定义异常继承Exception类
    public MyException(){};
    public MyException(String Message){
        super(Message);
    };
}
class CheckSex{
    public void Check(String Sex)throws MyException{
        if (Sex.equals("boy")||Sex.equals("girl")||Sex.equals("男")||Sex.equals("女")){
            /*特别注意，String方法相等的判断方法要用equals，而不能像数值一样使用==*/
            System.out.println("性别符合要求");

        }
        else{throw new MyException("性别不符合要求");}

    }
}