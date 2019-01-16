package com.franklee.com.services;

import com.franklee.com.entity.Test;
import com.franklee.com.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    TestMapper testMapper;

    public List<Test> singleDateSourse(){
        return testMapper.singleDateSourse();
    }
}
