package com.cjl.dao.impl;

import com.cjl.dao.OrderDao;
import com.cjl.domain.Cart;
import com.cjl.domain.Order;
import com.cjl.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Order> findBySorder(String sorder) {
        String sql = "select * from `order` where sorder = ?";
        List<Order> orders = null;
        try {
            orders = template.query(sql, new BeanPropertyRowMapper<>(Order.class),sorder);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return orders;
    }

    @Override
    public List<Order> findBySuser(String suser) {
        String sql = "select * from `order` where suser = ?";
        List<Order> orders;
        try {
            orders = template.query(sql, new BeanPropertyRowMapper<>(Order.class),suser);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return orders;
    }
}
