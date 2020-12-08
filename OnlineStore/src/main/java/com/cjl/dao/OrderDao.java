package com.cjl.dao;

import com.cjl.domain.Order;

import java.util.List;

public interface OrderDao {
    List<Order> selectBySorder(String sorder);
    List<Order> selectBySuser(String suser);
    int insertByOrder(Order order);

    int updateSdeliveryByOrder(Order order);

    List<Order> selectAllOrder();

    int updateOrderByOrder(Order order);
}
