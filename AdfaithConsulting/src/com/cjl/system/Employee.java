package com.cjl.system;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Employee {
	private String payrollNumber;//员工工资单号
	private String telephoneNumber;
	private String lastName;//姓氏
    private String firstName;//名字
    private String initial;//首字母
    private int departmentNum;//部门编号
    private String job;
    private Date dateHired;//录用日期
    
    public Employee() {
    }

    public Employee(String lastName, String firstName, String initial, String payrollNumber, String telephoneNumber, int departmentNum, String job, Date dateHired) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.initial = initial;
        this.payrollNumber = payrollNumber;
        this.telephoneNumber = telephoneNumber;
        this.departmentNum = departmentNum;
        this.job = job;
        this.dateHired = dateHired;
    }

	public String getPayrollNumber() {
		return payrollNumber;
	}

	public void setPayrollNumber(String payrollNumber) {
		this.payrollNumber = payrollNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public int getDepartmentNum() {
		return departmentNum;
	}

	public void setDepartmentNum(int departmentNum) {
		this.departmentNum = departmentNum;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(payrollNumber, employee.payrollNumber) &&
                departmentNum == employee.departmentNum &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(initial, employee.initial) &&
                Objects.equals(telephoneNumber, employee.telephoneNumber) &&
                Objects.equals(job, employee.job) &&
                Objects.equals(dateHired, employee.dateHired);
    }
	@Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, initial, payrollNumber, telephoneNumber, departmentNum, job, dateHired);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return payrollNumber + ":" + telephoneNumber + ":" + lastName + ":" + firstName + ":" + initial + ":" + departmentNum + ":" + job + ":" + sdf.format(dateHired);
    }

    public String format() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return format2(lastName) + format2(firstName) + format2(initial) + format2(payrollNumber) + format2(telephoneNumber) + format2(departmentNum + "") + format2(job) + format2(sdf.format(dateHired));
    }

    public String format2(String str) {
        int len = str.length();
        for (int i = 0; i < 20 - len; i++) {
            str = str + " ";
        }
        return str;
    }
    
    
}
