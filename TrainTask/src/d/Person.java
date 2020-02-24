package d;

public class Person {
	private String name;
	String sex;
	int age;
	String country;
	//--------------------------------------方法
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	public void work() {
		System.out.println("工作");
	}
	//-------------------------------------get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
