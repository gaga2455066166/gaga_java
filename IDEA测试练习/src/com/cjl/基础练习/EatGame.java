package com.cjl.基础练习;

public class EatGame {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //添加了多线程,并发吃瓜，保证比赛公平性。

        Animal animal0 = new Animal();
        animal0.setType("龚佳煌");
        double speed = Math.random();
        animal0.setSpeedOfEat(speed);

        Animal animal1 = new Animal();
        animal1.setType("王有鋆");
        speed = Math.random();
        animal1.setSpeedOfEat(speed);

        Animal animal2 = new Animal();
        animal2.setType("陈进龙");
        speed = Math.random();
        animal2.setSpeedOfEat(speed);


        System.out.println("---B509年度吃瓜大赛，比赛开始！---");
        Thread threadAnimal0 = new Thread(animal0);
        Thread threadAnimal1 = new Thread(animal1);
        Thread threadAnimal2 = new Thread(animal2);
        threadAnimal0.start();
        threadAnimal1.start();
        threadAnimal2.start();


    }
}

interface Eating {
    public void eatWaterMelon();

    public void stop();
}

abstract class animalFeatures {
    public void eat() {
    }

    public void sleep() {
    }

}

class Animal extends animalFeatures implements Eating, Runnable {
    private String type;
    private double speedOfEat;
    private long time;
    public static final int maxNumOfMelon = 3;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeedOfEat() {
        return this.speedOfEat;
    }

    public void setSpeedOfEat(double speedOfEat) {
        this.speedOfEat = speedOfEat;
    }

    public static int getMaxNumOfMelon() {
        return maxNumOfMelon;
    }

    //@Override
    public void eatWaterMelon() {
        System.out.println("---" + this.getType() + "开始吃西瓜," + "速度为：" + this.getSpeedOfEat()+ "---" );
    }

    public void stop() {
        System.out.println("┌-----------------------------------┐");
        System.out.println("│\t"+this.getType() + "吃完了" + getMaxNumOfMelon() + "个西瓜"+"\t\t\t\t│");
        System.out.println("│\t" + this.getType() + "完成了比赛,用时：" + (System.currentTimeMillis()-this.getTime())+"\t\t│");
        System.out.println("└-----------------------------------┘");

    }

    @Override
    public void sleep() {
        System.out.println("---" + this.getType() + "吃饱了睡觉去"+ "---");
    }

    @Override
    public void run() {
        this.setTime(System.currentTimeMillis());
        this.eatWaterMelon();
        double stomach = getMaxNumOfMelon();
        while (stomach > 0) {
            stomach = stomach - this.getSpeedOfEat();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---"+this.getType() + "吃了" + this.getSpeedOfEat() + "个西瓜,还剩下：" + stomach+"---");

        }
        this.stop();
        this.sleep();


    }
}

