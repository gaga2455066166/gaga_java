package j;

public class Circle extends Shape{
	int r;
	public Circle(int r) {
		super();
		this.r = r;
	}

	public Circle() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void draw() {
		// TODO �Զ����ɵķ������
		System.out.println("Draw Circle:");
	}

	@Override
	public double getPerimeter() {
		// TODO �Զ����ɵķ������
		return 3.14*r*2;
	}

	@Override
	public double getArea() {
		// TODO �Զ����ɵķ������
		return 3.14*r*r;
	}

	@Override
	public void draw(String color) {
		// TODO �Զ����ɵķ������
		System.out.println("Draw Circle:" + color);
	}

}
