package com.franklee.com.services;

import com.franklee.com.entity.Test;
import com.franklee.com.entity.User;
import com.franklee.com.mapper.TestMapper;
import com.franklee.com.mapper2.TestMapper2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    TestMapper testMapper;

    @Resource
    TestMapper2 testMapper2;

    public List<Test> singleDateSourse(){
        return testMapper.singleDateSourse();//agent库
    }

    public List<User> secondDBDate(){
        return testMapper2.secondDBDate();//ubuntu库
    }
}
