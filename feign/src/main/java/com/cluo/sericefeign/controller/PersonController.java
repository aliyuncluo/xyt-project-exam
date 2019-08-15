package com.cluo.sericefeign.controller;

import com.cluo.sericefeign.FeignInterface.PersonServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 13:49
 */
@RestController
public class PersonController {

    @Autowired
    PersonServiceFeign personServiceFeign;

    @GetMapping("/test/person")
    public List<Map<String,Object>> selectPersonInfo(){
        return personServiceFeign.selectPersonInfo();
    }

    @PostMapping("/test/findName")
    public List<Map<String, Object>> selectPersonInfoByName(@RequestParam("name") String name){
        return personServiceFeign.selectPersonInfoByName(name);
    }
}
