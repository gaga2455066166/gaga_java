package T20200310;

public class Test2 {
	public static void main(String[] args) {
		TestRunnable testRunnable = new TestRunnable();
		Thread thread = new Thread(testRunnable);
		thread.start();
		while(true){
			System.out.println("Test Main...");
		}
		
	}
}
