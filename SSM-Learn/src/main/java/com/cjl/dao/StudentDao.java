package com.cjl.dao;

import com.cjl.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}
