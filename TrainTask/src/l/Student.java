package l;

public class Student {
	int sno;
	String nameString;
	int age;
	
	
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(int sno, String nameString, int age) {
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
	
}
