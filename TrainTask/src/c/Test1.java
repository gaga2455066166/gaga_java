package c;

public class Test1 {
	public static void main(String[] args) {
		HappyDog happyDog = new HappyDog();
		happyDog.setAge(2);
		happyDog.setName("Íú²Æ");
		happyDog.shout();
		happyDog.eat();
		happyDog.happy();
		happyDog.showAge();
		happyDog.showName();
		happyDog.show();
		System.out.println("------------------------");
		
		
		happyDog.shout();
		happyDog.superShout();
		happyDog.superSuperShout();
		
		System.out.println("------------------------");
		
		HappyDog c = new HappyDog();
		c.showName();
		System.out.println("------------------------");
		HappyDog d = new HappyDog("Ð¡¹·");
		d.showName();
		
 	}
}
