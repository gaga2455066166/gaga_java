package j;

public class Circle extends Shape{
	int r;
	public Circle(int r) {
		super();
		this.r = r;
	}

	public Circle() {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void draw() {
		// TODO 自动生成的方法存根
		System.out.println("Draw Circle:");
	}

	@Override
	public double getPerimeter() {
		// TODO 自动生成的方法存根
		return 3.14*r*2;
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return 3.14*r*r;
	}

	@Override
	public void draw(String color) {
		// TODO 自动生成的方法存根
		System.out.println("Draw Circle:" + color);
	}

}
