package d;

public class Student extends Person{
	String school;
	String id;
	//----------------------------方法
	public void work() {
		System.out.println("学生的工作重载为：学习");
	}
	//----------------------------构造方法
	public Student() {
		System.out.println("学生的无参数的构造方法被调用");
	}
	public Student(String name,String school,String id) {
		this.id=id;
		this.school=school;
		this.setName(name);
		System.out.println("学生的带3个参数的构造方法被调用");
	}
	//-----------------------------get set
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
