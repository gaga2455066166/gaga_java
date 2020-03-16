package com.cjl.Task3月;

public class SaveMoney implements Runnable {
    private final Bank bank;

    public SaveMoney(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        // TODO 自动生成的方法存根
        for (int i = 0; i < 3; i++) {
            synchronized (bank) {
                bank.add(100);
                System.out.println(Thread.currentThread().getName() + "存100元钱，余额为:" + bank.getMoney());
            }
        }
    }
}
