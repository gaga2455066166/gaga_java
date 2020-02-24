package b;

public interface IPerson {
	public abstract void run();
	public abstract void eat();
	
	public final static String name="»À";
	public final static int id = 4;
	public static void sleep() {
		System.out.println("sleeping");
	}
	public default void play() {}
}
