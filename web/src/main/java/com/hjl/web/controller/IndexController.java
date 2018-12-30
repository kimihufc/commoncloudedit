package com.hjl.web.controller;

import com.hjl.client.OrderClient;
import com.hjl.dd.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: HJL
 * @create: 2018-12-30 16:22
 */
@RestController
@RequestMapping(value = "index")
public class IndexController {

    @Autowired
    private OrderClient orderClient;


    @GetMapping(value = "gainList")
    public List<Order> gainList(){
        return orderClient.gainOrderList();
    }

}
