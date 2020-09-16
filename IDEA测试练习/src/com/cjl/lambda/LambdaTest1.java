package com.cjl.lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        invokeCalc(12, 23, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        invokeCalc(12, 12, (int a, int b) -> {
            return a + b;
        });
    }

    public static void invokeCalc(int a, int b, Calculator c) {
        int s = c.calc(a, b);
        System.out.println(s);


    }
}
