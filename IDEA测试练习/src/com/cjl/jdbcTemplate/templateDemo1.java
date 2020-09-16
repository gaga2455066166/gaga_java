package com.cjl.jdbcTemplate;

import com.cjl.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class templateDemo1 {


    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update admin set name = ? where id = 3";
        int count = template.update(sql, "三w号");
        System.out.println(count);
    }
}
