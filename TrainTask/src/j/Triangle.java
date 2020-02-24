package j;

public class Triangle extends Shape {
	int a;
	int b;
	int c;
	public Triangle() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Triangle(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public void draw() {
		// TODO 自动生成的方法存根
		System.out.println("Draw Triangle:");
	}

	@Override
	public double getPerimeter() {
		// TODO 自动生成的方法存根
		return (a+b+c)/2;
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return Math.sqrt( ((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
	}
	@Override
	public void draw(String color) {
		// TODO 自动生成的方法存根
		System.out.println("Draw Triangle:" + color);
	}
	

}
