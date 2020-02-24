package e;

public class Circle extends Shape{
	double r;
	public Circle(String color,double r) {
		this.color=color;
		this.r=r;
		System.out.println("Circle的带两个参数的构造方法被调用");
	}
	public void show() {
		System.out.println("半径为：" + r);
		super.show();
	}
	public void area() {
		this.area=3.14*r*r;
		System.out.println("面积为："+ area);
	}
}
