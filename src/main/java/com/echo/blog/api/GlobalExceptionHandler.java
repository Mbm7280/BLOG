package com.echo.blog.api;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @className GlobalExceptionHandler
 * @author Echo
 * @description 控制层异常切面
 * @updateTime 2021/12/13 21:34
 * @version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = GlobalException.class)
    public SystemResult handle(GlobalException e) {
        if (e.getCode() != null) {
            return SystemResult.fail(e.getCode(),e.getMessage());
        }
        return SystemResult.fail(e.getCode(),e.getMessage());
    }

}
