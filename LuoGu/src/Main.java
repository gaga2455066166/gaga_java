import java.util.*;

public class Main {
	static int x[] = new int[20];
	static int n, k;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		for (int i = 0; i < n; i++)
			x[i] = scan.nextInt();
		System.out.println(Rule(k, 0, 0, n - 1));
	}

	public static int Rule(int left, int aSum, int start, int end) {
//		System.out.println(n);
		if (left == 0)
			return prime(aSum);
		int sum = 0;
		for (int i = start; i <= end; i++) 
			sum += Rule(left-1, aSum + x[i], i + 1, end);
		return sum;
	}

	public static int prime(int n) {//ÅÐ¶ÏÊÇ·ñÖÊÊý
		int s = (int)Math.sqrt((double) n);
		for (int i = 2; i <= s; i++) {
			if (n % i == 0)return 0;
		}
		return 1;
	}

}