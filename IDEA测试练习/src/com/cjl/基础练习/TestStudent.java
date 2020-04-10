package com.cjl.基础练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student(1,"Chen",123);
        Student student2 = new Student(2,"Lin",12);
        Student student3 = new Student(3,"Lua",13);
        Student student4 = new Student(4,"Hia",103);
        Student student5 = new Student(5,"Che",153);
        Student student6 = new Student(6,"Asi",193);
        Student student7 = new Student(7,"Xcd",103);
        Student student8 = new Student(8,"Rui",133);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        studentArrayList.add(student6);
        studentArrayList.add(student7);
        studentArrayList.add(student8);
        Collections.sort(studentArrayList);
        System.out.println("foreach:");
        for (Student student :
                studentArrayList) {
            System.out.println(student);

        }
        System.out.println("next:");
        Iterator i = studentArrayList.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
    }
}
