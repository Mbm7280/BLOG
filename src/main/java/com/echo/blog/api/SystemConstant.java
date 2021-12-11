package com.echo.blog.api;

/**
 * @className SystemConstant
 * @author Echo
 * @description 系统常量接口
 * @updateTime 2021/12/11 22:31
 * @version 1.0
 */
public interface SystemConstant {

    int SYSTEM_SUCCESS = 0000; //返回成功
    int SYSTEM_ERROR = 9999;  //返回错误
    int LOGIN_FAIL = 9991; //登录失败
    int NO_LOGIN = 9992; //未登录
    int NO_PERMISSION = 9993; //无权限
    int PARAM_ERROR = 9994; //参数异常
    int REPEAT_LOGIN = 9995; // 重复登录

}
