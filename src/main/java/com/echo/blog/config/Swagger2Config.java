package com.echo.blog.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @className Swagger2Config
 * @author Echo
 * @description Swagger2配置类
 * @updateTime 2021/12/14 19:53
 * @version 1.0
 */

@Configuration
@EnableSwagger2
@EnableKnife4j // Swagger2增强工具
public class Swagger2Config {

    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.echo.blog.modules")
                .title("Echo-blog")
                .description("blog项目骨架相关接口文档")
                .contactName("Echo")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
