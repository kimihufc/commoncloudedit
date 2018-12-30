package com.hjl.order.service.impl;

import com.hjl.dd.Order;
import com.hjl.order.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: HJL
 * @create: 2018-12-30 14:46
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public List<Order> findAll() {
        List<Order> result = new ArrayList<>();
        Order test = new Order();
        test.setName("手机");
        test.setPrice("1000.00");
        result.add(test);
        return result;
    }
}
