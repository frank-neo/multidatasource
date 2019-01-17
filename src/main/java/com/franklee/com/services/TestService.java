package com.franklee.com.services;

import com.franklee.com.annotations.DS;
import com.franklee.com.entity.Test;
import com.franklee.com.entity.User;
import com.franklee.com.mapper.TestMapper;
import com.franklee.com.mapper2.TestMapper2;
import com.franklee.com.mapperdynamic.DyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    TestMapper testMapper;

    @Resource
    TestMapper2 testMapper2;

    @Resource
    DyMapper dyMapper;

    public List<Test> singleDateSourse() {
        return testMapper.singleDateSourse();//agent库
    }

    public List<User> secondDBDate() {
        return testMapper2.secondDBDate();//ubuntu库
    }

    /**
     * 动态数据源查询数据
     */
    @DS("firstDB")
    public List<User> DynamicDBDate1() {
        return dyMapper.DynamicDBDate();
    }

    @DS("secondDB")
    public List<User> DynamicDBDate2() {
        return dyMapper.DynamicDBDate();
    }
}
