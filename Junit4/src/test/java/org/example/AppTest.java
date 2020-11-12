package org.example;

import static java.lang.Math.sqrt;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    public static void main(String[] args) {
        while(true){
            int x;
            int y;
            int z;
            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
            doWork(x,y,z);

        }
    }
    public static void doWork(int x,int y,int z) {
        int k = 0;
        double j = 0;
        System.out.println((x > 3) && (z < 10));
        if ((x > 3) && (z < 10)) {
            k = x * y - 1;     //语句块1
            System.out.println("(x > 3) && (z < 10)  k="+k);
            j = sqrt(k);
            System.out.println("(x > 3) && (z < 10)  j="+j);
        }
        System.out.println((x == 4) || (y > 5));
        if ((x == 4) || (y > 5)) {
            j = x * y + 10;   //语句块2
            System.out.println("(x == 4) || (y > 5) j="+j);
        }
        j = j % 3;             //语句块3
        System.out.println(j);
    }

}
