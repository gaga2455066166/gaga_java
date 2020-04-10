package com.cjl.基础练习;

public class Account {
    private String userName;
    private String password;
    private double balance = 0;

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account(String userName,
                   String password, double balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double money){
        balance = balance - money;
    }
    public void save(double money){
        balance = balance + money;
    }

    @Override
    public String toString() {
        return "Account: " +
                "用户名=" + userName +
                "\t\t余额=" + balance;
    }
}
