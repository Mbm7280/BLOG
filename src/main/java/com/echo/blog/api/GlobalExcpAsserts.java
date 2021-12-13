package com.echo.blog.api;

/**
 * @className GlobalExcpAsserts
 * @author Echo
 * @description 异常断言处理类(抛异常)
 * @updateTime 2021/12/13 21:30
 * @version 1.0
 */
public class GlobalExcpAsserts {

    public static void fail(Integer code,String message) {
        throw new GlobalException(code,message);
    }

}
