package e;

public class Rectangle extends Shape{
	double len;
	double wid;
	public Rectangle(String color,double len,double wid) {
		this.color=color;
		this.len=len;
		this.wid=wid;
		System.out.println("Rectangle�Ĵ�3�������Ĺ��췽��������");
	}
	public void show() {
		super.show();
		System.out.println("��Ϊ��"+ len);
		System.out.println("��Ϊ��" +wid);
	}
	public void area(){
		this.area=len*wid;
		System.out.println("Rectangle�����Ϊ��" + this.area);
	}
}
