package com.cluo.authority.service.impl;

import com.cluo.authority.mapper.PersonMapper;
import com.cluo.authority.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 13:44
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;

    @Override
    public List<Map<String, Object>> selectPersonInfo() {
        return personMapper.selectPersonInfo();
    }

    @Override
    public List<Map<String, Object>> selectPersonInfoByName(String name) {
        return personMapper.selectPersonInfoByName(name);
    }
}
