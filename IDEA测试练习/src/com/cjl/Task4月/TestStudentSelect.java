package com.cjl.Task4月;

import java.util.ArrayList;

public class TestStudentSelect {
    public static void main(String[] args) {
        StudentDaoImplement studentDaoImplement = new StudentDaoImplement();
        ArrayList<Student> students = studentDaoImplement.getAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
