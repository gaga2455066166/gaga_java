package com.cjl.基础练习;

import java.util.*;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank("B509超级银行");
        Account account = new Account("王小龚","123456");
        bank.addAccount(account);
        bank.showAccount();

    }
}
