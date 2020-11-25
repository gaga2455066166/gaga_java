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

        return dao.selectBySorder(sorder);
    }

    @Override
    public List<Order> findOrderListBySuser(String suser) {
        return dao.selectBySuser(suser);
    }

    @Override
    public int saveOrderByOrder(Order order) {
//        System.out.println("service impl ");
        return dao.insertByOrder(order);
    }

    @Override
    public int modifySdeliveryByOrder(Order order) {
        System.out.println("order service impl");
        return dao.updateSdeliveryByOrder(order);
    }
}
