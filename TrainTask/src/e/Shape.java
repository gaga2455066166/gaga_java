package e;

public class Shape {
	String color;
	double area;
	public Shape() {
		System.out.println("Shape���޲����Ĺ��췽��");
	}
	public Shape(String color) {
		this.color=color;
		System.out.println("Shape�Ĵ���ɫ�����Ĺ��췽��������");
	}
	public void show() {
		System.out.println("��ɫΪ��" + color);
	}
}
