package com.cluo.sericefeign.FeignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 11:32
 */
@FeignClient(value = "CONFIG-API")
public interface UserServiceFeign {

    @GetMapping("/test/user")
    public List<Map<String,Object>> selectUserInfo();
}
