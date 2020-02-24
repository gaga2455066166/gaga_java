package k;

public class TestString {
	public static void main(String[] args) {
		String s1 = "";
		String s2="1234567890";
		String s3 = "abcdefg";
		String s4 = "apple";
		String s5 = "ChenJinLongChenGe";
		String s6 = "ChenJinLongChenGe";
		System.out.println("5 first appeared in s2:"+s2.indexOf('5'));
		System.out.println("p last appeared in s4:"+s4.lastIndexOf('p'));
		System.out.println("cd first appeared in s3:"+s3.indexOf("cd"));
		System.out.println("Chen last appeared in s5:"+s5.lastIndexOf("Chen"));
		System.out.println("s4 at 2:"+s4.charAt(2));
		System.out.println("if s5 ends with Ge:"+s5.endsWith("Ge"));
		System.out.println("\"\"");
		System.out.println("s1 length :" + s1.length());
		System.out.println("if s5==s6:" + s6.equals(s5));
		System.out.println("if s1 is empty:" + s1.isEmpty());
		System.out.println("if s3 start with abc :" +s3.startsWith("abc"));
		System.out.println("if s3 contains with abc :" +s3.contains("abc"));
		System.out.println("s5 to lowercase :" +s5.toLowerCase() + s5);
		System.out.println("s5 to uppercase :" +s5.toUpperCase() + s5);
		System.out.println("s1 + 123:" +String.valueOf(123) + s1);
		String s0 = "I Love Java";
		System.out.println(s0.toLowerCase());
		String s7 = "this is my homework! i must finish it!";
		String[] s8= s7.split(" ");
		System.out.println("ÓÐ £º"+s8.length +"¸ö");
		
	}
}
