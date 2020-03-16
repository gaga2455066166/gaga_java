package ื๗าต0313;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		TestRunnable test1 = new TestRunnable();
		TestRunnable test2 = new TestRunnable();
		Thread thread1 = new Thread(test1);
		Thread thread2 = new Thread(test2);
		thread1.start();
		thread2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
		}
		
		
	}
}
