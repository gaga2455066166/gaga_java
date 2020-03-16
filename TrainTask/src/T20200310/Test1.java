package T20200310;

public class Test1 {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		while(true) {
			System.out.println("Run Main ...");
		}
	}
}
