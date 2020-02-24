package e;

public class Rectangle extends Shape{
	double len;
	double wid;
	public Rectangle(String color,double len,double wid) {
		this.color=color;
		this.len=len;
		this.wid=wid;
		System.out.println("Rectangle的带3个参数的构造方法被调用");
	}
	public void show() {
		super.show();
		System.out.println("长为："+ len);
		System.out.println("宽为：" +wid);
	}
	public void area(){
		this.area=len*wid;
		System.out.println("Rectangle的面积为：" + this.area);
	}
}
