package j;

public class Triangle extends Shape {
	int a;
	int b;
	int c;
	public Triangle() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Triangle(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public void draw() {
		// TODO �Զ����ɵķ������
		System.out.println("Draw Triangle:");
	}

	@Override
	public double getPerimeter() {
		// TODO �Զ����ɵķ������
		return (a+b+c)/2;
	}

	@Override
	public double getArea() {
		// TODO �Զ����ɵķ������
		return Math.sqrt( ((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
	}
	@Override
	public void draw(String color) {
		// TODO �Զ����ɵķ������
		System.out.println("Draw Triangle:" + color);
	}
	

}
