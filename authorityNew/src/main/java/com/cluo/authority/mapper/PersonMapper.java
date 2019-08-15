package com.cluo.authority.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 13:41
 */
@Mapper
public interface PersonMapper {

    List<Map<String,Object>> selectPersonInfo();

    List<Map<String,Object>> selectPersonInfoByName(@Param("name") String name);
}
