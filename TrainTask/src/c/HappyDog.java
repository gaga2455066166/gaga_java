package c;

public class HappyDog extends Dog{
	
	public HappyDog() {
		System.out.println("HappyDog���޲����Ĺ��췽��������");
	}
	public HappyDog(String name) {
		super(name);
		System.out.println("HappyDog�������Ĺ��췽��������");
	}
	
	public void happy() {
		System.out.println("HappyDog �ܿ���!");
	}
	public void shout() {
		System.out.println("Happy����");
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
