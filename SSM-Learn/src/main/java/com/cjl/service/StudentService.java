package com.cjl.service;

import com.cjl.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();
}
