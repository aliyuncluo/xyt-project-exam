package com.cluo.authority.service;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 13:43
 */
public interface PersonService {

    public List<Map<String,Object>> selectPersonInfo();

    List<Map<String,Object>> selectPersonInfoByName(String name);
}
