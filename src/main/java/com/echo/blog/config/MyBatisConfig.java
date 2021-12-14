package com.echo.blog.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @className MyBatisConfig
 * @author Echo
 * @description MyBatis-Mapper配置类
 * @updateTime 2021/12/14 12:50
 * @version 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.echo.blog.modules.*.mapper"})
public class MyBatisConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }
}
