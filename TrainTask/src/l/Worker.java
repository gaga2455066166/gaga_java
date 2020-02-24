package l;

public class Worker {
	String namString;
	int age;
	int money;

	public Worker(String namString, int age, int money) {
		super();
		this.namString = namString;
		this.age = age;
		this.money = money;
	}

	public Worker() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public String getNamString() {
		return namString;
	}

	public void setNamString(String namString) {
		this.namString = namString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String toString() {

		return this.namString + " " + this.age + " " + this.money;
	}
}
