package com.cjl.dao.Impl;

import com.cjl.dao.UserDao;
import com.cjl.domain.User;
import com.cjl.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //jdbc操作数据库
        String sql = "select * from user";
        List<User> uesrs;
        uesrs = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return uesrs;
    }

    @Override
    public User findUserByIdAndUsername(Integer id, String username) {
        User user;
        try {
            String sql = "select * from user where id = ? and username = ?";
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id, username);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return user;

    }

    @Override
    public void add(User user) {
        String sql = "insert into user values (?,?,?,?,?,?,?)";
        template.update(sql, user.getId(), user.getUsername(),
                user.getGender(), user.getAge(),
                user.getAddress(), user.getQq(),
                user.getEmail());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where id = ?";
        template.update(sql, id);
    }

    @Override
    public User findUserById(int id) {
        User user;
        try {
            String sql = "select * from user where id = ?";
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return user;
    }

    @Override
    public void update(User user) {
        String sql = "update user set " +
                "gender = ? , age = ? , address = ? , qq = ? , email = ? where id = ?";
        template.update(sql, user.getGender(), user.getAge(),
                user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }
}
