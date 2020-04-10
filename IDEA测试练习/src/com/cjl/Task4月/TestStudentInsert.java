package com.cjl.Task4月;

public class TestStudentInsert {
    public static void main(String[] args) {
        StudentDaoImplement studentDaoImplement = new StudentDaoImplement();
        Student student = new Student("TestName",12,"男","123456","12345678900");
        System.out.println(studentDaoImplement.addStudent(student));
    }
}
