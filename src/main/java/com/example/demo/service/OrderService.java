package com.example.demo.service;


import com.example.demo.dao.OrderDao;
import com.example.demo.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public Order getOrder(long orderId){
        Order order = orderDao.getById(orderId);
        return  order;
    }

    public List<Order> getOrderList(long orderId){
        List<Order> list = orderDao.getOrderList(orderId);
        return  list;
    }

    @Transactional
    public Order updateOrder(long orderId){
        int result = orderDao.updateById(orderId);
        Order order = orderDao.getById(orderId);
        return  order;
    }

    public List<Integer> getTest(){
        List<Integer> list = orderDao.getTest();
        return  list;
    }
}
