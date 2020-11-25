package com.cjl.service;

import com.cjl.domain.Cart;
import com.cjl.domain.Order;

import java.util.List;

public interface OrderService {
    List<Order> findOrderListBySorder(String sorder);
    List<Order> findOrderListBySuser(String suser);

    int saveOrderByOrder(Order order);
}
