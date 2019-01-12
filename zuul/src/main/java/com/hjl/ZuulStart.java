package com.hjl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: HJL
 * @create: 2019-01-12 15:05
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulStart {

    public static void  main(String [] args){
        SpringApplication.run(ZuulStart.class,args);
    }
}
