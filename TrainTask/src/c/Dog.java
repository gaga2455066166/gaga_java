package c;

public class Dog extends Animal{
	
	public Dog() {
		System.out.println("Dog���޲����Ĺ��췽��������");
	}
	public Dog(String name) {
		super(name);
		System.out.println("Dog�������Ĺ��췽��������");
	}
	
	public void eat() {
		System.out.println("������Թ�ͷ");
	}
	public void shout() {
		System.out.println("����");
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
