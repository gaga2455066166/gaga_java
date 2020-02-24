package i;

public class Test1 {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		try {
			int c=divide(a,b);
		} catch (Exception e) {
			// TODO: handle exception
			//e.getMessage();
			System.out.println(e.getMessage());
		}
		
	}
	public static int divide(int a,int b) throws ArithmeticException{
		return a/b;
	}
}

