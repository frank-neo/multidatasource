package com.franklee.com.mapper2;

import com.franklee.com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper2 {

    @Select("SELECT alias,NAME,url,surname FROM users")
    List<User> secondDBDate();//ubuntu库
}
