package com.cluo.sericefeign.controller;

import com.cluo.sericefeign.FeignInterface.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 11:33
 */
@RestController
public class UserController {
    @Autowired
    UserServiceFeign userServiceFeign;

    @GetMapping("/test/user")
    public List<Map<String,Object>> selectUserInfo(){
        return userServiceFeign.selectUserInfo();
    }
}
