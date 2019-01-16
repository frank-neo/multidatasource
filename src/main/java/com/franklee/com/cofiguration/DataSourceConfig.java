package com.franklee.com.cofiguration;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 由于我们禁掉了自动数据源配置，因些下一步就需要手动将这些数据源创建出来：
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "firstDB")
    @ConfigurationProperties(prefix = "spring.datasource.first") // application.properteis中对应属性的前缀
    public DataSource dataSource1() {
        return (DataSource) DataSourceBuilder.create().build();
    }

    @Bean(name = "secondDB")
    @ConfigurationProperties(prefix = "spring.datasource.second") //// application.properteis中对应属性的前缀
    public DataSource dataSource2() {
        return (DataSource) DataSourceBuilder.create().build();
    }
}
