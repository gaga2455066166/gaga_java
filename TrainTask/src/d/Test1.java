package d;

public class Test1 {
	public static void main(String[] args) {
		StudentLeader s1= new StudentLeader();
		s1.eat();
		s1.meeting();
		s1.sleep();
		System.out.println(s1.getName());
		System.out.println("-------------------");
		Worker w1=new Worker();
		System.out.println("-------------------");
		Worker w2=new Worker("³Â", "ÄĞ", "ÂëÅ©", 9);
		System.out.println(w2.getName());
	}
}
