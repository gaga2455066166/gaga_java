package org.example;

import domain.Computer;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.assertEquals;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test1.class,
        Test2.class
})

public class Test2 {


    @BeforeClass
    public static void TestStart() {
        System.out.println("start:");
    }


    @AfterClass
    public static void TestFinish() {
        System.out.println("finish!");
    }

//    @Test(timeout = 1000)
    public void TestSquare() {
        Computer computer = new Computer(4);
        computer.square();
    }

//    @Test(expected = ArithmeticException.class)
    public void TestDivideByZero() {
        System.out.println("TestException");
        Computer computer = new Computer(0, 4);
        computer.divide();
    }

    @Test
    public void TestDivide1() {
        System.out.println("参数化测试1");
        Computer computer = new Computer(5, 5);
        System.out.println(computer.divide());
    }


    @Test
    public void TestDivide2() {
        System.out.println("参数化测试2");
        Computer computer = new Computer(2, 0);
        System.out.println(computer.divide());
    }


    @Test
    public void TestDivide3() {
        System.out.println("参数化测试3");
        Computer computer = new Computer(-1, 2);
        System.out.println(computer.divide());
    }

}