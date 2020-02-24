package e;

public class Shape {
	String color;
	double area;
	public Shape() {
		System.out.println("Shape的无参数的构造方法");
	}
	public Shape(String color) {
		this.color=color;
		System.out.println("Shape的带颜色参数的构造方法被调用");
	}
	public void show() {
		System.out.println("颜色为：" + color);
	}
}
