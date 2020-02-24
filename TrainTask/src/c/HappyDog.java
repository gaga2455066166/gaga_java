package c;

public class HappyDog extends Dog{
	
	public HappyDog() {
		System.out.println("HappyDog的无参数的构造方法被调用");
	}
	public HappyDog(String name) {
		super(name);
		System.out.println("HappyDog的有数的构造方法被调用");
	}
	
	public void happy() {
		System.out.println("HappyDog 很开心!");
	}
	public void shout() {
		System.out.println("Happy狗叫");
	}
	public void superShout() {
		super.shout();
	}
	public void superSuperShout() {
		super.superShout();
	}
	public void show() {
		showAge();
		showName();
	}
}
