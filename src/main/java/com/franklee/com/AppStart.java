package com.franklee.com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@MapperScan("com.franklee.com.mapper")springboot使用默认数据源的时候扫面的mapper配置
public class AppStart {
    public static void main(String[] args) {

        SpringApplication.run(AppStart.class, args);
    }
}
