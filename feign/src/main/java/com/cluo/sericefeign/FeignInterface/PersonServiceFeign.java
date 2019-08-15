package com.cluo.sericefeign.FeignInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 13:47
 */
@FeignClient("CONFIG-API")
public interface PersonServiceFeign {

    @GetMapping("/test/person")
    public List<Map<String,Object>> selectPersonInfo();

    @PostMapping("/test/findName")
    public List<Map<String, Object>> selectPersonInfoByName(@RequestParam("name") String name);
}
