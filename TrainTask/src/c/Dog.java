package c;

public class Dog extends Animal{
	
	public Dog() {
		System.out.println("Dog的无参数的构造方法被调用");
	}
	public Dog(String name) {
		super(name);
		System.out.println("Dog的有数的构造方法被调用");
	}
	
	public void eat() {
		System.out.println("狗狗会吃骨头");
	}
	public void shout() {
		System.out.println("狗叫");
	}
	public void superShout() {
		super.shout();
	}
	public void showAge() {
		System.out.println(age);
	}
	public void showName() {
		System.out.println(name);
	}
}
