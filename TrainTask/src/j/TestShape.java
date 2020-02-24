package j;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		Triangle t = new Triangle(2, 2, 2);
		t.draw();
		System.out.println("面积" + t.getArea());
		System.out.println("周长" + t.getPerimeter());
		System.out.println("------------------------");
		Circle c = new Circle(3);
		c.draw();
		System.out.println("面积" + c.getArea());
		System.out.println("周长" + c.getPerimeter());
		System.out.println("------------------------");
		Rectangle r = new Rectangle(2,6);
		r.draw();
		System.out.println("面积" + r.getArea());
		System.out.println("周长" + r.getPerimeter());
		System.out.println("------------------------");
		System.out.println("Shape存shape");
		shapes[0] = t;
		shapes[1] = c;
		shapes[2] = r;
		for(int i=0;i<3;i++) {
			shapes[i].draw();
			System.out.println("面积" + shapes[i].getArea());
			System.out.println("周长" + shapes[i].getPerimeter());
			System.out.println("------------------------");
		}
		t.draw("红色");
		
	}
}
