package com.cjl.springboot.demo.service.impl;


import com.cjl.springboot.demo.mapper.StudentMapper;
import com.cjl.springboot.demo.model.Student;
import com.cjl.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }


}
