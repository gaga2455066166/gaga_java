package Mooc;

public class Test2 {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 3; i <= 5; i++) {
			s = (int) (s + (Math.pow(i, 3)));
		}
		if (s == (int) Math.pow(6, 3))
			System.out.println("");
		else {
			System.out.println("");
		}

		s = 0;
		for (int i = 6; i <= 69; i++) {
			s = (int) (s + (Math.pow(i, 3)));

		}
		if (s == (int) Math.pow(180, 3)) {
			System.out.println("");
		} else {
			System.out.println("");
		}

	}
}
