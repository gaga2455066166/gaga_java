package 作业0313;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		TestThread test1 = new TestThread();
		TestThread test2 = new TestThread();
//		test1.setName("线程1");
//		test2.setName("线程2");
		test1.start();
		test2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
		}

	}
}
