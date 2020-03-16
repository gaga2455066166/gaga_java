package ื๗าต0226;

public class Student {
	String nameString;
	int age;
	
	public Student(String nameString ,int age) {
		this.nameString = nameString;
		this.age = age;
	}
	public Student() {
		
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
	public String toString() {
		return "Student [" + nameString + "," + age + "]";
	}

}
