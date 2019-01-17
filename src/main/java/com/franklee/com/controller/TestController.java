package com.franklee.com.controller;

import com.franklee.com.entity.Test;
import com.franklee.com.entity.User;
import com.franklee.com.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/singleDateSourse", method = RequestMethod.GET)
    public List<Test> singleDateSourse() {
        return testService.singleDateSourse();//agent库
    }

    @RequestMapping(value = "/secondDBDate", method = RequestMethod.GET)
    public List<User> secondDBDate() {
        return testService.secondDBDate();//ubuntu库
    }

    /**
     * 动态数据源查询
     */
    @RequestMapping(value = "/DyDate1", method = RequestMethod.GET)
    public List<User> DynamicDBDate1() {
        return testService.DynamicDBDate1();
    }

    @RequestMapping(value = "/DyDate2", method = RequestMethod.GET)
    public List<User> DynamicDBDate2() {
        return testService.DynamicDBDate2();
    }
}
