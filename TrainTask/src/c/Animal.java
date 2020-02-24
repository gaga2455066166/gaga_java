package c;

public class Animal {
	String name;
	int age;
	public Animal() {
		System.out.println("Animal的无参数的构造方法被调用");
	}
	public Animal(String name) {
		System.out.println("Animal的有参数的构造方法被调用");
		this.name=name;
	}
	
	public void shout() {
		System.out.println("动物叫");
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
