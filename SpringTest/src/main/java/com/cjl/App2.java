package com.cjl;

import com.cjl.domain.User;
import com.cjl.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App2 {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.cjl.dao.UserDao" + "." + "selectUsers";
        List<User> users = sqlSession.selectList(sqlId);
        users.forEach(System.out::println);
        sqlSession.close();
    }
}
