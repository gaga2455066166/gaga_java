package d;

public class Worker extends Person{
	String employer;
	int work_age;
	//-------------------
	public void work() {
		System.out.println("���˵Ĺ�������Ϊ���ϰ�");
	}
	//-------------------------
	public Worker() {
		System.out.println("���˵��޲����Ĺ��췽��������");
	}
	public Worker(String name,String sex,String employer,int work_age) {
		this.setName(name);
		this.sex=sex;
		this.employer=employer;
		this.work_age=work_age;
		System.out.println("���˵Ĵ��ĸ������Ĺ��췽��������");
	}
}
