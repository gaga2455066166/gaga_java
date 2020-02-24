package d;

public class Worker extends Person{
	String employer;
	int work_age;
	//-------------------
	public void work() {
		System.out.println("工人的工作重载为：上班");
	}
	//-------------------------
	public Worker() {
		System.out.println("工人的无参数的构造方法被调用");
	}
	public Worker(String name,String sex,String employer,int work_age) {
		this.setName(name);
		this.sex=sex;
		this.employer=employer;
		this.work_age=work_age;
		System.out.println("工人的带四个参数的构造方法被调用");
	}
}
