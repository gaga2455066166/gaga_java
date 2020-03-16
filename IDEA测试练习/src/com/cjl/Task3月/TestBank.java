package com.cjl.Task3月;

public class TestBank {
    public static void main(String[] args) {

        Bank bank0 = new Bank();
        SaveMoney person = new SaveMoney(bank0);
        Thread t1 = new Thread(person, "陈进龙");
        Thread t2 = new Thread(person, "陈进龙的弟弟");
        t1.start();
        t2.start();

    }

}


