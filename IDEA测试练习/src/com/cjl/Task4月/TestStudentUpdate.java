package com.cjl.Task4月;

public class TestStudentUpdate {
    public static void main(String[] args) {
        StudentDaoImplement studentDaoImplement = new StudentDaoImplement();
        Student student = new Student(1,"Test1",12,"男","123456","12345678900");
        System.out.println(studentDaoImplement.updateStudent(student));
    }
}
