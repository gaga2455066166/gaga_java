package j;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		Triangle t = new Triangle(2, 2, 2);
		t.draw();
		System.out.println("���" + t.getArea());
		System.out.println("�ܳ�" + t.getPerimeter());
		System.out.println("------------------------");
		Circle c = new Circle(3);
		c.draw();
		System.out.println("���" + c.getArea());
		System.out.println("�ܳ�" + c.getPerimeter());
		System.out.println("------------------------");
		Rectangle r = new Rectangle(2,6);
		r.draw();
		System.out.println("���" + r.getArea());
		System.out.println("�ܳ�" + r.getPerimeter());
		System.out.println("------------------------");
		System.out.println("Shape��shape");
		shapes[0] = t;
		shapes[1] = c;
		shapes[2] = r;
		for(int i=0;i<3;i++) {
			shapes[i].draw();
			System.out.println("���" + shapes[i].getArea());
			System.out.println("�ܳ�" + shapes[i].getPerimeter());
			System.out.println("------------------------");
		}
		t.draw("��ɫ");
		
	}
}
