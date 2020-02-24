package j;

public class Rectangle extends Shape{
	int a;
	int b;
	@Override
	public void draw() {
		// TODO 自动生成的方法存根
		System.out.println("Draw Rectangle:");
	}

	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double getPerimeter() {
		// TODO 自动生成的方法存根
		return (a+b)*2;
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return a*b;
	}

	public Rectangle() {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void draw(String color) {
		// TODO 自动生成的方法存根
		System.out.println("Draw Rectangle:" + color);
	}

}
