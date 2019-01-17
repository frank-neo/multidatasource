package com.franklee.com.cofiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 首先定义一个ContextHolder, 用于保存当前线程使用的数据源名：
 */
public class DataSourceContextHolder {

    public static final Logger log = LoggerFactory.getLogger(DataSourceContextHolder.class);

    /**
     * 默认数据源
     */
    public static final String DEFAULT_DS = "firstDB";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    // 设置数据源名
    public static void setDB(String dbType) {
        log.debug("切换到{}数据源", dbType);
        contextHolder.set(dbType);//存入线程变量String类型的数据源名称，后期要根据这个key在map里面拿到DateSourse对象
    }

    // 获取数据源名
    public static String getDB() {
        return (contextHolder.get());//取线程变量
    }

    // 清除数据源名
    public static void clearDB() {
        contextHolder.remove();//删除线程变量
    }
}
