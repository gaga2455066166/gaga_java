package com.cjl.dao;

import com.cjl.domain.Order;

import java.util.List;

public interface OrderDao {
    List<Order> findBySorder(String sorder);
    List<Order> findBySuser(String suser);
}
