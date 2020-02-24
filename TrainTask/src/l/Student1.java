package l;

public class Student1 implements Comparable<Student1>{
	int sno;
	String nameString;
	int age;
	
	
	public Student1() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student1(int sno, String nameString, int age) {
		super();
		this.sno = sno;
		this.nameString = nameString;
		this.age = age;
	}
	
	public String toString() {
		
		return this.sno + " " + this.nameString + " " + this.age;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO 自动生成的方法存根
		if(this.sno<o.sno)
			return -1;
		else
			return 1;
	}
}
