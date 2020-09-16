package com.cjl.jdbcTemplate;

import com.cjl.domain.Admin;
import com.cjl.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class templateDemo2 {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void test1() {
        System.out.println("Test1");
        String sql = "update admin set name = ? where id = 2";
        int count = template.update(sql, "管理员");
        System.out.println(count);
    }

    @Test
    public void test2() {
        System.out.println("Test2");
        String sql = "insert into admin values (?,?,?)";
        int count = template.update(sql, 4, "90909", "管理员假");
        System.out.println(count);
    }

    @Test
    public void test3() {
        System.out.println("Test3");
        String sql = "delete from admin where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }

    @Test
    public void test4() {
        System.out.println("Test4");
        String sql = "select * from admin where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
    }

    @Test
    public void test5() {
        System.out.println("Test5");
        String sql = "select * from admin";
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    @Test
    public void test6() {
        System.out.println("Test6");
        String sql = "select * from admin";
        List<Admin> admins = template.query(sql, new RowMapper<Admin>() {
            @Override
            public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
                Admin admin = new Admin();
                int id = resultSet.getInt("id");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                admin.setId(id);
                admin.setPassword(password);
                admin.setName(name);
                return admin;
            }
        });
        for (Admin admin : admins) {
            System.out.println(admin);

        }
    }

    @Test
    public void test7() {
        System.out.println("Test7");
        String sql = "select * from admin";
        List<Admin> admins = template.query(sql, new BeanPropertyRowMapper<Admin>(Admin.class));
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }

    @Test
    public void test8() {
        System.out.println("Test8");
        String sql = "select count(id) from admin";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
