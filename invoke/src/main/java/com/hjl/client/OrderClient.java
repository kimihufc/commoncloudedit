package com.hjl.client;

import com.hjl.dd.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author: HJL
 * @create: 2018-12-30 14:34
 *  拍坑记
 *    使用FeignClient  value里面的值不能有 _  这个值对应着提供服务的 spring.application.name
 */
@FeignClient(value = "common-order",path = "order")
public interface OrderClient {

    @GetMapping(value = "gainOrderList")
    List<Order> gainOrderList();
}
