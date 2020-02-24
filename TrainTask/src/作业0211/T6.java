package ื๗าต0211;

import java.math.BigInteger;

public class T6 {
	public static void main(String[] args) {
	    BigInteger [] bi=new BigInteger[100];
	    bi[0]=bi[1]=BigInteger.valueOf(1);
	    for (int i = 2; i < 100; i++) {
			bi[i]=bi[i-1].add(bi[i-2]);
		}
	    System.out.println(bi[11]);
	}
}
