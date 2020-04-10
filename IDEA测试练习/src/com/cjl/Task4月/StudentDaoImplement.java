package com.cjl.Task4月;

import com.cjl.tools.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDaoImplement {

    ArrayList<Student> students = new ArrayList<>();
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public StudentDaoImplement() {
        conn = JDBCUtils.getConn();
    }

    public ArrayList<Student> getAllStudent() {
        String sql = "SELECT * FROM student";
        try {
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setAge(resultSet.getInt(3));
                student.setSex(resultSet.getString(4));
                student.setPassword(resultSet.getString(5));
                student.setPhone(resultSet.getString(6));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    public int addStudent(Student student) {
        String sql = "insert into student(sid, sname, sage, ssex, spassword, sphone)" +
                "values (null, ?, ?, ?, ?, ?);";
        int insertNum = -1;
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setInt(2,student.getAge());
            preparedStatement.setString(3,student.getSex());
            preparedStatement.setString(4,student.getPassword());
            preparedStatement.setString(5,student.getPhone());
            insertNum = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return insertNum;
    }
    public int updateStudent(Student student){
        String sql = "update student " +
                "set sname = ?," +
                "    sage = ?," +
                "    ssex = ?," +
                "    spassword = ?," +
                "    sphone = ?" +
                " where sid = ?;";
        int updateNum = -1;
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setInt(2,student.getAge());
            preparedStatement.setString(3,student.getSex());
            preparedStatement.setString(4,student.getPassword());
            preparedStatement.setString(5,student.getPhone());
            preparedStatement.setInt(6,student.getId());
            updateNum = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return updateNum;
    }
    public int deleteStudent(Student student){
        String sql = "delete from student where sid = ?;";
        int deleteNum = -1;
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,student.getId());
            deleteNum = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return deleteNum;
    }

}
