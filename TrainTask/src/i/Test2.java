package i;

public class Test2 {
	public static void main(String[] args) {
		String str = "12e";
		try {
			int x = stringToInt(str);
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static int stringToInt(String str) throws Exception {
		int f = 0, a;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) > '9' || str.charAt(i) < '0')
				f = 1;
		if (f == 1) {
			throw new TestException1("有错误的类型转换");
		} else {
			a = Integer.parseInt(str);
		}

		return a;
	}
}
