package com.franklee.com.cofiguration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 由于我们禁掉了自动数据源配置，因些下一步就需要手动将这些数据源创建出来：
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "firstDB")
    @ConfigurationProperties(prefix = "spring.datasource.first") // application.properteis中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondDB")
    @ConfigurationProperties(prefix = "spring.datasource.second") //// application.properteis中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }


    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     */
    @Bean(name = "dynamicDS1")
    public DataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dataSource1());

        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap(5);
        dsMap.put("firstDB", dataSource1());
        dsMap.put("secondDB", dataSource2());

        dynamicDataSource.setTargetDataSources(dsMap);

        return dynamicDataSource;
    }
}
