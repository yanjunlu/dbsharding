package com.example.demo;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void sharingTest() {
        Order order = orderService.getOrder(1);
        assertEquals(1, order.getOrderId());

        order = orderService.getOrder(2);
        assertEquals(2, order.getOrderId());

        order = orderService.getOrder(0);
        assertNull(order);

        List<Order> list = orderService.getOrderList(1);
        assertTrue(list.size() > 0);
        System.out.println(list.get(0).getOrderId());
    }


    @Test
    public void sharingAndReadWriteTest() {
        Order order = orderService.getOrder(1);
        assertEquals(1, order.getOrderId());
        assertEquals("slave", order.getRemark());

        order = orderService.updateOrder(1);
        assertEquals(1, order.getOrderId());
        assertEquals("master", order.getRemark());

        order = orderService.getOrder(2);
        assertEquals(2, order.getOrderId());
        assertEquals("slave", order.getRemark());

        order = orderService.getOrder(0);
        assertNull(order);

        List<Order> list = orderService.getOrderList(1);
        assertTrue(list.size() > 0);
        System.out.println(list.get(0).getOrderId());

    }
}
