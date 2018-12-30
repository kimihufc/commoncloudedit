package com.hjl.client;

import com.hjl.yh.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @athor: HJL
 * @create: 2018-12-30 14:17
 */
@FeignClient(value = "common-user",path = "user")
public interface UserClient {

    @GetMapping(value = "gainUser")
    User gainUser(String name);

    @PostMapping(value = "judgePass")
    Boolean judgePass(String name,String pass);
}
