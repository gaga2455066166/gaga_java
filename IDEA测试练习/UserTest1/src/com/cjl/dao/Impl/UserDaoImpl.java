package com.cjl.dao.Impl;

import com.cjl.dao.UserDao;
import com.cjl.domain.User;
import com.cjl.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //jdbc操作数据库
        String sql = "select * from user";
        List<User> uesrs;
        uesrs = template.query(sql, new BeanPropertyRowMapper<>(User.class));
        return uesrs;
    }

    @Override
    public User findUserByIdAndUsername(Integer id, String username) {
        User user;
        try {
            String sql = "select * from user where id = ? and username = ?";
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id, username);
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
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
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

    @Override
    public List<User> findPageByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "select * from user where 1 = 1 ";
        StringBuilder sb = new StringBuilder(sql);
        Set<String> keySet = condition.keySet();
        List<Object> params = new ArrayList<>();
        for (String key : keySet) {
            if ("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }
            String value = condition.get(key)[0];
            if (value != null && !"".equals(value)) {
                //有对应值，就是有条件
                sb.append(" and ").append(key).append(" like ?");
                params.add("%" + value + "%");
            }
        }
        sb.append(" limit ?,? ");
        params.add(start);
        params.add(rows);
        System.out.println(sb.toString());
        return template.query(sb.toString(), new BeanPropertyRowMapper<>(User.class), params.toArray());
    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        String sql = "select count(*) from user where 1 = 1 ";
        StringBuilder sb = new StringBuilder(sql);
        Set<String> keySet = condition.keySet();
        List<Object> params = new ArrayList<>();
        for (String key : keySet) {
            if ("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }
            String value = condition.get(key)[0];
            if (value != null && !"".equals(value)) {
                //有对应值，就是有条件
                sb.append(" and ").append(key).append(" like ?");
                params.add("%" + value + "%");
            }
        }
//        System.out.println(sb.toString());
//        System.out.println(params);


        return template.queryForObject(sb.toString(), Integer.class, params.toArray());


    }
}
