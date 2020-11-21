package com.cjl.service.impl;

import com.cjl.dao.OrderDao;
import com.cjl.dao.impl.OrderDaoImpl;
import com.cjl.domain.Order;
import com.cjl.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private final OrderDao dao = new OrderDaoImpl();
    @Override
    public List<Order> findOrderListBySorder(String sorder) {

        return dao.findBySorder(sorder);
    }

    @Override
    public List<Order> findOrderListBySuser(String suser) {
        return dao.findBySuser(suser);
    }
}
