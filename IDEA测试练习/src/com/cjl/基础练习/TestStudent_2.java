package com.cjl.基础练习;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent_2 {
    public static void main(String[] args) {
        Student_2 s1 = new Student_2("b", 15);
        Student_2 s2 = new Student_2("a", 16);
        Student_2 s3 = new Student_2("c", 16);
        HashMap<Student_2, String> maps = new HashMap<Student_2, String>();
        maps.put(s1, "成都");
        maps.put(s3, "上海");
        maps.put(s2, "北京");
        Set<Student_2> set = maps.keySet();
        Set<Student_2> ts = new TreeSet<Student_2>(set);
        Iterator<Student_2> it = ts.iterator();

        while (it.hasNext()) {

            Student_2 stu = it.next();

            System.out.println(stu + "   " + maps.get(stu));

        }
    }
}
