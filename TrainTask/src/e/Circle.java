package e;

public class Circle extends Shape{
	double r;
	public Circle(String color,double r) {
		this.color=color;
		this.r=r;
		System.out.println("Circle�Ĵ����������Ĺ��췽��������");
	}
	public void show() {
		System.out.println("�뾶Ϊ��" + r);
		super.show();
	}
	public void area() {
		this.area=3.14*r*r;
		System.out.println("���Ϊ��"+ area);
	}
}
