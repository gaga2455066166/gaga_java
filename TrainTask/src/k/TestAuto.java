package k;

public class TestAuto {
	public static void main(String[] args) {
		StringBuffer s =  new StringBuffer("wwwww");
		s.append("wwwwwwwwww");
		System.out.println(s);
		String str = "12345678";
		String str1 = str.valueOf(123);
		Integer i1;
		i1 = Integer.valueOf(str);
		System.out.println(i1);
		i1=Integer.valueOf(123);
		System.out.println(i1);
		int i2 = Integer.parseInt("456789");
		System.out.println(i2);
		System.out.println(i1.toString());
	}
}
