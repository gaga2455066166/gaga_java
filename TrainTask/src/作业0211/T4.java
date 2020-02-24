package ื๗าต0211;

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		String aString;
		Scanner scanner = new Scanner(System.in);
		aString = scanner.nextLine();
		int a = aString.indexOf("end");
		if(a != 0) {
			aString = aString.substring(0,a);
		}
		System.out.println(aString);
		char[] c = aString.toCharArray();
		for(int i =0;i<aString.length();i++) {
			if(c[i]<='z' && c[i]>='a')
				c[i]-=32;
			else if(c[i]<='Z' && c[i]>='Z')
				c[i]+=32;
			else
				c[i]='*';
		}
		System.out.println(c);
	}
}
