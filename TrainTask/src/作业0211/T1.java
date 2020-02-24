package ื๗าต0211;

public class T1 {
	public static void main(String[] args) {
		String aString = " asd fgh jkl ";
		System.out.println(aString.isEmpty());
		System.out.println(aString.charAt(2));
		System.out.println(aString.toLowerCase());
		System.out.println(aString.toUpperCase());
		aString.replace('a', 'h');
		System.out.println(aString);
		aString.replace("asd", "qwe");
		System.out.println(aString);
		System.out.println(aString.trim());
	}
}
