package a;

import b.IPerson;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setName("³ÂÁù");
		p1.setAge(19);
		System.out.println(p1.toString());
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		p2.setName("³ÂÁù");
		p2.setAge(19);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		p2 = p1;
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println("------------------------------------");
		String s1 = p1.toString();
		String s2 = p2.toString();
		String s3 = "xiao";
		String s4 = "xiao";
		String s5 = new String("xiao");

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));
		System.out.println(s3 == s5);
		PersonImpl personImpl = new PersonImpl();
		IPerson.sleep();
	}
}
