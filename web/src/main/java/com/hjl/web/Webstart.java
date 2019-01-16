package com.hjl.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: HJL
 * @create: 2018-12-30 12:32
 * 排坑记  因为熔断在com.hjl.client.hystrix 导致主类扫描未扫描到
 */
@SpringBootApplication(scanBasePackages = {"com.hjl"})
@EnableFeignClients(basePackages = {"com.hjl"})
@EnableHystrix
public class Webstart {

    public static void  main(String [] args){
        SpringApplication.run(Webstart.class,args);
    }
}
