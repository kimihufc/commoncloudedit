package com.hjl.client.hystrix;

import com.hjl.client.OrderClient;
import com.hjl.dd.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author: HJL
 * @create: 2019-01-16 17:02
 */
@Component
public class OrderClientHystrix implements OrderClient {

    @Override
    public List<Order> gainOrderList() {
        Order order = new Order();
        order.setName("默认");
        order.setPrice("0.00");
        return Arrays.asList(order);
    }
}
