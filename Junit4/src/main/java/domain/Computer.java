package domain;

public class Computer {
    private int a;
    private int b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Computer(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Computer(int a) {
        this.a = a;
    }

    public int add() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        return a / b;
    }


    public void square() {
        for (; ; ) ;
    }

}
