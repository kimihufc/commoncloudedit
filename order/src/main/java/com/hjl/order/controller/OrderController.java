package com.hjl.order.controller;

import com.hjl.dd.Order;
import com.hjl.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: HJL
 * @create: 2018-12-30 14:43
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "gainOrderList")
    public List<Order> findList() {
        return orderService.findAll();
    }

}
