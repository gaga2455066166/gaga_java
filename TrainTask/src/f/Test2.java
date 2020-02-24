package f;

public class Test2 {
	public static void main(String[] args) {
		Ifly fly1 = new Bird();
		Ifly fly2 = new Plain();
		fly(fly1);
		fly(fly2);
		
	}
	public static void fly(Ifly i) {
		i.fly();
	}
}
