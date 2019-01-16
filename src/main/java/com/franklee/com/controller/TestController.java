package com.franklee.com.controller;

import com.franklee.com.entity.Test;
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
        return testService.singleDateSourse();
    }
}
