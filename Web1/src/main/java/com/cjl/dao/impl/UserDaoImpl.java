package com.cjl.dao.impl;

import com.cjl.dao.UserDao;
import com.cjl.domain.User;
import com.cjl.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
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
            System.out.println("There is no data for this username: " + username + " in the database!");
            return null;
        }
        System.out.println("The username: " + username + " already exists!");
        return user;

    }

    @Override
    public void save(User user) {
        String sql = "insert into tab_user(username, password, name, birthday, sex, telephone, email,status,code) values (?,?,?,?,?,?,?,?,?)";
        int update = template.update(sql, user.getUsername(), user.getPassword(), user.getName(), user.getBirthday(), user.getSex(), user.getTelephone(), user.getEmail(), user.getStatus(), user.getCode());
        System.out.println("insert " + update + " piece of data," + "username:" + user.getUsername());
    }

    /**
     * 用激活码寻找用户
     *
     * @param code 激活码
     * @return 寻找到的用户
     */
    @Override
    public User findByCode(String code) {
        String sql = "select * from tab_user where code = ?";
        User user = null;
        try {
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), code);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("用户激活失败：差找不到code：" + code + "对应的用户");
        }
        return user;
    }

    /**
     * 修改指定用户的激活状态
     *
     * @param user 要修改的用户
     * @return 返回是否修改成功
     */
    @Override
    public boolean updateStatus(User user) {
        String sql = "update tab_user set status = 'Y' where uid = ?";
        int update = template.update(sql, user.getUid());
        return update > 0;
    }
}
