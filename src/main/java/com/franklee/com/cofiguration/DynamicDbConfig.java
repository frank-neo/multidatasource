package com.franklee.com.cofiguration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 接下来需要配置mybatis的SqlSessionFactory使用的数据源：
 */
@Configuration
@MapperScan(basePackages = {"com.franklee.com.mapperdynamic"}, sqlSessionFactoryRef = "sqlSessionFactoryDY")
public class DynamicDbConfig {

    @Autowired
    @Qualifier("dynamicDS1")
    private DataSource dsD;

    @Bean
    public SqlSessionFactory sqlSessionFactoryDY() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dsD); // 使用firstDB数据源, 连接firstDB库

        return factoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryDY()); // 使用上面配置的Factory
        return template;
    }
}
