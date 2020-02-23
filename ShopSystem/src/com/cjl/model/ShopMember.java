package com.cjl.model;
/**
 * 会员实体
 * @author 24550
 *
 */
public class ShopMember {
	private String name;
	private String sex;
	private int age;
	private String personId;
	//private String phone;
	private String address;
	private int id;
	private String idPassword;
	private int level;
	private double points;
	private double balance;
	private double totalBalance;
	private int times;
	
	public ShopMember() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public ShopMember(String name, String sex, int age, String personId, String address, String idPassword,
			int level, double points, double balance, int times) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.personId = personId;
		this.address = address;
		this.idPassword = idPassword;
		this.level = level;
		this.points = points;
		this.balance = balance;
		this.totalBalance = balance;
		this.times = times;
	}
	public ShopMember(String name, String sex,  String personId, String idPassword,int id) {//注销会员用
		//super();
		this.name = name;
		this.sex = sex;
		this.personId = personId;
		this.idPassword = idPassword;
		this.id = id;
	}
	public ShopMember(int id,String name,int level) {//会员列表用
		//super();
		this.name = name;
		this.id = id;
		this.level = level;
	}
	public ShopMember(int id,String idPassword) {
		this.idPassword = idPassword;
		this.id = id;
	}
	
	//**********************************
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
	public void setPoints(double points) {
		this.points = points;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdPassword() {
		return idPassword;
	}
	public void setIdPassword(String idPassword) {
		this.idPassword = idPassword;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(float points) {
		this.points = points;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(float totalBalance) {
		this.totalBalance = totalBalance;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
}
