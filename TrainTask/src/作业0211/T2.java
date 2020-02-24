package ื๗าต0211;

public class T2 {

	public static String getPropertyGetMethodName(String property) {
		return "get" + property.substring(0,1).toUpperCase() + property.substring(1);
	}
	public static void main(String[] args) {
		String aString="name";
		System.out.println(getPropertyGetMethodName(aString));
	}
}
