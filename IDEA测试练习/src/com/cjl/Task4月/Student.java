package com.cjl.Task4月;

public class Student {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String password;
    private String phone;

    public Student() {

    }

    public Student(int id, String name, int age, String sex, String password, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.password = password;
        this.phone = phone;
    }

    public Student(String name, int age, String sex, String password, String phone) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.password = password;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student:" +
                "id=" + id +
                "\tname=" + name +
                "\t\tage=" + age +
                "\t\tsex=" + sex +
                "\t\tpassword=" + password +
                "\t\tphone=" + phone;
    }
}
