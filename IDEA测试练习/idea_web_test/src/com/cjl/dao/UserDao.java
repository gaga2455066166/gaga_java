package com.cjl.dao;

import com.cjl.domain.User;
import com.cjl.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDs());
    public User login(User loginUser){
        try {
            String sql = "select * from db_day14.user where username = ? and password = ?";
            User user;
            user = jdbcTemplate.queryForObject(
                    sql, new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            System.out.println("查询不到用户");
            return null;
        }
    }
}
