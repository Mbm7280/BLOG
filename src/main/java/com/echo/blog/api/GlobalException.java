package com.echo.blog.api;

import lombok.Data;

/**
 * @className ApiException
 * @author Echo
 * @description 自定义系统异常
 * @updateTime 2021/12/13 21:17
 * @version 1.0
 */

@Data
public class GlobalException extends RuntimeException {

    private Integer code = 9999;
    private String message;


    public GlobalException(Integer code,String message){
        super(message);
        this.code = code;
        this.message = message;
    }

    public GlobalException(Throwable cause){
        super(cause);
    }

    public GlobalException(String message, Throwable cause) {
        super(message, cause);
    }

}
