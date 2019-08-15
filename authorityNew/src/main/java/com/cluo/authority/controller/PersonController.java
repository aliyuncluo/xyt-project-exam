package com.cluo.authority.controller;

import com.cluo.authority.service.PersonService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 13:45
 */
@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/test/person")
    public List<Map<String,Object>> selectPersonInfo(){
          return personService.selectPersonInfo();
    }

    @PostMapping("/test/findName")
    public List<Map<String, Object>> selectPersonInfoByName(@RequestParam("name") String name){
        return personService.selectPersonInfoByName(name);
    }
}
