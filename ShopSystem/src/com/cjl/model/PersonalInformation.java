package com.cjl.model;

public class PersonalInformation {
	private String name;
	private String sex;
	private int age;
	private String personId;
	private String address;
	
	
	public PersonalInformation() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public PersonalInformation(String name, String sex, int age, String personId, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.personId = personId;
		this.address = address;
	}
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
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
