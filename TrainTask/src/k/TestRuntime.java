package k;

public class TestRuntime {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.availableProcessors());
	}
}
