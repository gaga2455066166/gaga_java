package com.cjl.Test线程;


public class Hero {
    public String name;
    public float hp;
    public int damage;
    int totalTime = 3;

    /**
     * 有参数构造
     *
     * @param name
     * @param hp
     * @param damage
     */
    public Hero(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    /**
     * 无参数构造
     */
    public Hero() {
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void attackHero(Hero hero) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.hp = hero.hp - damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f",
                this.name, hero.name, hero.name, hero.hp);
        if (hero.isDead())
            System.out.println(hero.name + "死了！");
    }

    public boolean isDead() {
        return 0 >= this.hp;
    }
    public void wave() {
        while (true) {
            for (int i = 0; i < totalTime; i++) {
                System.out.printf("波动拳第%d发%n", i + 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            System.out.println("开始为时5秒的充能");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName("Chen");
        hero1.wave();
    }
}
