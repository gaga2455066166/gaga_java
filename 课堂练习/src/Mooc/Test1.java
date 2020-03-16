package Mooc;


public class Test1 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int n :arr) {////////////////
			if (n != 0) {
				int j, temp;
				temp = n;
				for (j = 2 * temp; j < arr.length; j = j + temp) {
					arr[j] = 0;
				}
				System.out.print(n + " ");
			}
		}
	}
}