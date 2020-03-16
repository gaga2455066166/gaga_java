package com.cjl.Test线程;

public class TestSleep extends Thread{
    private int flag=0;
    @Override
    public void run() {
        while (flag <100){
            if(flag == 99){
                Thread.yield();
                System.out.print(flag);
            }


                System.out.println(Thread.currentThread().getName());
                flag ++;
            }

//        try{
//
//            System.out.println("睡眠测试");
//            while (flag <90){
//                if (flag == 5) {
//                    Thread.sleep(200);
//
//                    System.out.println(Thread.currentThread().getName() + "\t"+flag);
//                }
//                System.out.println(Thread.currentThread().getName());
//                flag ++;
//            }
//
//            System.out.println("线程结束后时间：" + System.currentTimeMillis());
//        }catch (InterruptedException e){
//            e.printStackTrace();
//
//        }
    }

    public static void main(String[] args) {
        TestSleep testSleep1 = new TestSleep();
        TestSleep testSleep2 = new TestSleep();
        System.out.println("线程开始前时间：" + System.currentTimeMillis());
        testSleep1.start();
//        try {
//            testSleep1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("开始线程2");
        testSleep2.start();
        //testSleep1.setPriority(Thread.MIN_PRIORITY);
        //testSleep2.setPriority(Thread.MAX_PRIORITY);



    }
}
