package j;

public class Rectangle extends Shape{
	int a;
	int b;
	@Override
	public void draw() {
		// TODO �Զ����ɵķ������
		System.out.println("Draw Rectangle:");
	}

	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double getPerimeter() {
		// TODO �Զ����ɵķ������
		return (a+b)*2;
	}

	@Override
	public double getArea() {
		// TODO �Զ����ɵķ������
		return a*b;
	}

	public Rectangle() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void draw(String color) {
		// TODO �Զ����ɵķ������
		System.out.println("Draw Rectangle:" + color);
	}

}
