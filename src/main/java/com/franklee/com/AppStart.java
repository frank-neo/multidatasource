package com.franklee.com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.franklee.com.mapper")
public class AppStart {
    public static void main(String[] args) {

        SpringApplication.run(AppStart.class, args);
    }
}
