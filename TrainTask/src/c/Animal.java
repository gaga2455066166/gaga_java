package c;

public class Animal {
	String name;
	int age;
	public Animal() {
		System.out.println("Animal���޲����Ĺ��췽��������");
	}
	public Animal(String name) {
		System.out.println("Animal���в����Ĺ��췽��������");
		this.name=name;
	}
	
	public void shout() {
		System.out.println("�����");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
