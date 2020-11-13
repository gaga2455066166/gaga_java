package org.example;

import domain.Computer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {


    @Before
    public void TestStart(){
        System.out.println("start:");
    }


    @After
    public void TestFinish(){
        System.out.println("finish!");
    }

    @Test
    public void TestAdd() {
        System.out.println("TestAdd");
        Computer computer = new Computer(1, 2);
        assertEquals(3,computer.add());
    }

    @Test
    public void TestMinus() {
        System.out.println("TestMinus");
        Computer computer = new Computer(1, 2);
        assertEquals(-1,computer.minus());
    }

    @Test
    public void TestMultiply() {
        System.out.println("TestMultiply");
        Computer computer = new Computer(1, 2);
        assertEquals(2,computer.multiply());
    }

    @Test
    public void TestDivide() {
        System.out.println("TestDivide");
        Computer computer = new Computer(4, 2);
        assertEquals(2,computer.divide());
    }
}
