package e;

public class TestShape {
	public static void main(String[] args) {
		Shape s1=new Shape();
		Shape s2=new Shape("��ɫ");
		Circle c1=new Circle("��ɫ", 1.3);
		s1.show();
		s2.show();
		c1.area();
		c1.show();
	}
}
