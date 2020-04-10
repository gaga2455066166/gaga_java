package com.cjl.基础练习;

public class Student_2 implements Comparable<Student_2> {
    private String name;
    private int age;

    public Student_2() {
    }

    public Student_2(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Student_2 o) {
        if (o != null) {
            int num = this.name.compareTo(o.name);
            if (num == 0) {
                if (this.age > o.age)
                    return 1;
                else if (this.age == o.age) {
                    return 0;
                }
                return -1;
            }
            return num;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student_2: name=" + name + "\tage=" + age;
    }
}
