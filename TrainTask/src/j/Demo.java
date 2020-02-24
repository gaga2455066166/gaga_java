package j;

public class Demo {
	public static void main(String[] args) {
		new Object() {
			public void show() {
				System.out.println("helloworld");
			}
		}.show();
	}
}

//public class Demo {
//	public static void main(String[] args) {
//		Demo demo = new Demo();
//		demo.show(new Car() {
//			public void run() {
//				System.out.println("demo run");
//			}
//		});
//	}
//
//	public void show(Car c) {
//		c.run();
//	}
//
//}
//
//abstract class Car {
//	public void run() {
//		System.out.println("car run...");
//	}
//}
