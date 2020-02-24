package d;

public class StudentLeader extends Student{
	String position;//职务
	//----------------------
	public void meeting() {
		System.out.println("开会");
	}
	//------------------------
	public StudentLeader() {
		super("chen", "闽江", "MJU3182703155");
		System.out.println("学生干部的无参数的构造方法被调用");
	}
}
