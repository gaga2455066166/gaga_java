package d;

public class Student extends Person{
	String school;
	String id;
	//----------------------------����
	public void work() {
		System.out.println("ѧ���Ĺ�������Ϊ��ѧϰ");
	}
	//----------------------------���췽��
	public Student() {
		System.out.println("ѧ�����޲����Ĺ��췽��������");
	}
	public Student(String name,String school,String id) {
		this.id=id;
		this.school=school;
		this.setName(name);
		System.out.println("ѧ���Ĵ�3�������Ĺ��췽��������");
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
