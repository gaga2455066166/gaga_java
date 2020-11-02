package com.cjl;

import com.cjl.domain.User;
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
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        String config = "mybatis.xml";
        InputStream is = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        String sqlId = "com.cjl.dao.UserDao"+"."+"selectUsers";
        List<User> users = sqlSession.selectList(sqlId);
        users.forEach(System.out::println);
        sqlSession.close();
    }
}
