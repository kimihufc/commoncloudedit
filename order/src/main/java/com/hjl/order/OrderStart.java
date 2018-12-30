package com.hjl.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: HJL
 * @create: 2018-12-30 14:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderStart {

    public static void main(String[] args) {
        SpringApplication.run(OrderStart.class, args);
    }

}
