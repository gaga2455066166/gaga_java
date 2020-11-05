package com.cjl;

import static org.junit.Assert.assertTrue;

import com.cjl.dao.UserDao;
import com.cjl.domain.User;
import com.cjl.utils.MyBatisUtils;
import com.cjl.vo.QueryParam1;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void Test0() throws IOException {
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

    @Test
    public void Test1(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> users = dao.selectUsers();
        users.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void Test2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        User user = dao.selectUserByIdUsername(2, "333");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void Test3(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        QueryParam1 param1 = new QueryParam1();
        param1.setParamId(2);
        param1.setParamUsername("333");
        User user = dao.selectUserByParam1(param1);
        System.out.println(user);
        sqlSession.close();
    }
}
