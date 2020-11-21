package com.cjl.dao;

import com.cjl.domain.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public interface OrderDao {
    List<Order> selectBySorder(String sorder);
    List<Order> selectBySuser(String suser);
    int insertByOrder(Order order);
}
