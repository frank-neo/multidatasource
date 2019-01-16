package com.franklee.com.mapper;

import com.franklee.com.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("Select id,fr,vbng from test")
    List<Test> singleDateSourse();//agent库
}
