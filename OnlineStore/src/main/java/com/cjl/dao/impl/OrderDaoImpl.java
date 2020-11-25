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
    public List<Order> selectBySorder(String sorder) {
        String sql = "select * from `order` where sorder = ?";
        List<Order> orders = null;
        try {
            orders = template.query(sql, new BeanPropertyRowMapper<>(Order.class), sorder);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return orders;
    }

    @Override
    public List<Order> selectBySuser(String suser) {
        String sql = "select * from `order` where suser = ?";
        List<Order> orders;
        try {
            orders = template.query(sql, new BeanPropertyRowMapper<>(Order.class), suser);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return orders;
    }

    @Override
    public int insertByOrder(Order order) {
        String sql = "insert into `order` values (?,?,?,?,?,?,?,?,?,?,?,?)";
        int insert = template.update(sql,
                order.getSorder(),
                order.getSuser(),
                order.getNid(),
                order.getSname(),
                order.getSdescription(),
                order.getNprice(),
                order.getSimg(),
                order.getNquantity(),
                order.getNtotal(),
                order.getDdate(),
                order.getSaddress(),
                order.getSdelivery()
        );
        return insert;
    }

    @Override
    public int updateSdeliveryByOrder(Order order) {
        System.out.println("order dao impl");
        String sql = "update `order` set sdelivery = ? where sorder = ? and suser = ? and nid = ?";
        int update = 0;
        try {
            update = template.update(sql,
                    "已收货",
                    order.getSorder(),
                    order.getSuser(),
                    order.getNid()
            );
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Update 0");
            return 0;
        }
        return update;
    }
}
