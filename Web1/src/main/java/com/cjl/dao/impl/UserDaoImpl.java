package com.cjl.dao.impl;

import com.cjl.dao.UserDao;
import com.cjl.domain.User;
import com.cjl.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * 跟数据库进行交互
 */
public class UserDaoImpl implements UserDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public User findByUsername(String username) {
        String sql = "select * from tab_user where username = ?";
        User user = null;
        try {
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("There is no data for this user name in the database!");
            return null;
        }
        return user;

    }

    @Override
    public void save(User user) {
        String sql = "insert into tab_user(username, password, name, birthday, sex, telephone, email) values (?,?,?,?,?,?,?)";
        int update = template.update(sql, user.getUsername(), user.getPassword(), user.getName(), user.getBirthday(), user.getSex(), user.getTelephone(), user.getEmail());
        System.out.println("insert " + update + " piece of data," + "username:" + user.getUsername());
    }
}
