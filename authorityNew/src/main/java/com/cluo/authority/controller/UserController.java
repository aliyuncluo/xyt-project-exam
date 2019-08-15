package com.cluo.authority.controller;

import com.cluo.authority.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 11:29
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/test/user")
    public List<Map<String,Object>> selectUserInfo(){
        return userService.selectUserInfo();
    }
}
