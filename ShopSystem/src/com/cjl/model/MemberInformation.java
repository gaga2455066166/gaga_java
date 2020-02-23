package com.cjl.model;

public class MemberInformation {

	private String personId;
	private int id;
	private String idPassword;
	private int level;
	private double points;
	private double balance;
	private double totalBalance;
	private int times;

	public MemberInformation(String personId, int id, String idPassword, int level, double points, double balance,
			double totalBalance, int times) {
		super();
		this.personId = personId;
		this.id = id;
		this.idPassword = idPassword;
		this.level = level;
		this.points = points;
		this.balance = balance;
		this.totalBalance = totalBalance;
		this.times = times;
	}

	public MemberInformation(String personId, String idPassword, double points, double balance) {
		super();
		this.personId = personId;
		this.idPassword = idPassword;
		this.points = points;
		this.balance = balance;
		this.totalBalance = balance;
	}

	public MemberInformation() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public MemberInformation(int id, String idPassword) {
		super();
		this.id = id;
		this.idPassword = idPassword;
		// TODO 自动生成的构造函数存根
	}

	public MemberInformation(int id, String idPassword, String personId) {
		super();
		this.id = id;
		this.idPassword = idPassword;
		this.personId = personId;
		// TODO 自动生成的构造函数存根
	}

	public MemberInformation(int id, String idPassword, int level) {
		super();
		this.id = id;
		this.idPassword = idPassword;
		this.level = level;
		// TODO 自动生成的构造函数存根
	}

	public MemberInformation(int id, String idPassword, double points) {
		super();
		this.id = id;
		this.idPassword = idPassword;
		this.points = points;
		// TODO 自动生成的构造函数存根
	}

	/**
	 * 
	 * @return
	 */
	public MemberInformation(Double balance,int id,String idPassword) {
		super();
		this.balance = balance;
		this.id = id;
		this.idPassword = idPassword;
		// TODO 自动生成的构造函数存根
	}
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
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

	public void setPoints(double points) {
		this.points = points;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

}
