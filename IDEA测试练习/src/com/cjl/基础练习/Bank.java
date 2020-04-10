package com.cjl.基础练习;

import java.util.ArrayList;

public class Bank {
    public String bankName = "B509超级银行";
    ArrayList<Account> accountArrayList = new ArrayList<>();

    public Bank() {
    }

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addAccount(Account account) {
        accountArrayList.add(account);
    }

    public void showAccount() {
        for (Account account : accountArrayList) {
            System.out.println(account);
        }
    }

    public void searchAccount(String name) {
        boolean flag = false;
        for (Account account : accountArrayList) {
            if (account.getUserName().equals(name)) {
                System.out.println(account);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("没有找到这个账户名！");
        }
    }

    public void saveMoney(Account account, double money) {
        account.save(money);
    }

    public void withdrawMoney(Account account, double money) {
        account.withdraw(money);
    }
}
