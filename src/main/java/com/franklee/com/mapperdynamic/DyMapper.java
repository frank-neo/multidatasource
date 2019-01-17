package com.franklee.com.mapperdynamic;

import com.franklee.com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface DyMapper {

    @Select("SELECT alias,NAME,url,surname FROM users")
    List<User> DynamicDBDate();//ubuntu库。agent库都有这个表，只是数据不同
}
