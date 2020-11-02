package com.cjl.domain;

public class User {
    private Integer id;
    private String username;
    private String gender;
    private Integer age;
    private String address;
    private String qq;
    private String email;

    public User(Integer id, String username, String gender, Integer age, String address, String qq, String email) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.qq = qq;
        this.email = email;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User:" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", qq='" + qq + '\'' +
                ", email='" + email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
