package com.example.demo.dao;

import com.example.demo.entity.Order;
import com.example.demo.entity.OrderItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

    Order getById(@Param("orderId") long orderId);

    List<Order> getOrderList(@Param("orderId") long orderId);

    int updateById(long orderId);

    List<Integer> getTest();

    List<OrderItem> getOrderItemByOrderId(long orderId);
}
