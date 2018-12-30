package com.hjl.order.service;


import com.hjl.dd.Order;

import java.util.List;

/**
 * @author: HJL
 * @create: 2018-12-30 14:45
 */
public interface OrderService {

    List<Order> findAll();
}
