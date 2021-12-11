package com.echo.blog.api;

import lombok.Getter;

/**
 * @className SystemEnum
 * @author Echo
 * @description 系统返回枚举值
 * @updateTime 2021/12/11 22:28
 * @version 1.0
 */
@Getter
public enum SystemEnum {

    LOGIN_FAIL(SystemConstant.LOGIN_FAIL,"用户名或密码错误"),
    NO_LOGIN(SystemConstant.NO_LOGIN,"请先登录"),
    LOGIN_EXPIRE(SystemConstant.NO_LOGIN,"登录超时请重新登录"),
    USERNAME_REPEAT(SystemConstant.SYSTEM_ERROR,"用户名已经存在"),
    REQUEST_FAIL(SystemConstant.SYSTEM_ERROR,"请求失败"),
    REQUEST_SUCCESS(SystemConstant.SYSTEM_SUCCESS,"请求成功"),
    NO_PERMISSION(SystemConstant.NO_PERMISSION,"没有操作权限,请联系管理员"),
    PARAM_ERROR(SystemConstant.PARAM_ERROR,"参数校验失败"),
    NO_DATA_FOR_ID(SystemConstant.SYSTEM_ERROR,"当前id没有对应的数据"),
    PARAM_EMPTY_ERROR(SystemConstant.SYSTEM_ERROR,"请求参数不能为空"),
    REPEAT_LOGIN(SystemConstant.REPEAT_LOGIN,"您的账号重复登录"),
    CHECKED(SystemConstant.SYSTEM_ERROR,"该项目已经被处理"),
    JWT_EXPIRE(SystemConstant.SYSTEM_ERROR,"凭证过期");

    private int code;
    private String msg;

    SystemEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

}

