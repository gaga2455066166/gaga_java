package com.cjl.Task3月;


import java.util.ArrayList;

public class Test0319 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int num = 0;
                long startTime = System.currentTimeMillis();
                while (System.currentTimeMillis() - startTime <= 20) {
                    synchronized (arrayList) {
                        arrayList.add("商品编号" + ++num);
                        System.out.println("生产了商品：" + num);
                        try {
                            if (arrayList.size() > 0)
                                arrayList.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                }

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int num = 0;
                long startTime = System.currentTimeMillis();
                while (System.currentTimeMillis() - startTime <= 20) {
                    synchronized (arrayList) {
                        if (arrayList.size() <= 0) {
                            arrayList.notify();
                        } else {
                            arrayList.remove("商品编号" + ++num);
                            System.out.println("超市销售商品：" + num);
                        }
                    }
                }

            }
        });
        thread1.start();
        thread2.start();

    }
}
