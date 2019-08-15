package com.cluo.authority.service.impl;

import com.cluo.authority.mapper.UserMapper;
import com.cluo.authority.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 11:27
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<Map<String, Object>> selectUserInfo() {
        return userMapper.selectUserInfo();
    }
}
