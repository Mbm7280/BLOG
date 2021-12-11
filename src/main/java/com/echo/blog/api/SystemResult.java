package com.echo.blog.api;

import lombok.Data;

import static com.echo.blog.api.SystemEnum.*;

/**
 * @className SystemResult
 * @author Echo
 * @description 系统统一返回类
 * @updateTime 2021/12/11 22:44
 * @version 1.0
 */

@Data
public class SystemResult<T> {

    private int code;

    private String msg;

    private T data;

    // 构造方法
    private SystemResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private SystemResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * @methodName success
     * @author Echo
     * @version 1.0
     * @description 返回系统默认的状态码
     * @updateTime 2021/12/11 22:50
     * @return: com.echo.blog.api.SystemResult
     * @throws
     */
    public static SystemResult success(){
        return new SystemResult(REQUEST_SUCCESS.getCode(),REQUEST_SUCCESS.getMsg());
    }

    /**
     * @methodName success
     * @author Echo
     * @param: msg
     * @version 1.0
     * @description 返回自定义状态信息
     * @updateTime 2021/12/11 22:51
     * @return: com.echo.blog.api.SystemResult
     * @throws
     */
    public static SystemResult success(String msg){
        return new SystemResult(REQUEST_SUCCESS.getCode(),msg);
    }

    /**
     * @methodName success
     * @author Echo
     * @param: data
     * @version 1.0
     * @description 返回系统默认状态码以及自定义数据
     * @updateTime 2021/12/11 22:52
     * @return: com.echo.blog.api.SystemResult
     * @throws
     */
    public static <T>SystemResult success(T data){
        return new SystemResult(REQUEST_SUCCESS.getCode(),REQUEST_SUCCESS.getMsg(),data);
    }


    /**
     * @methodName fail
     * @author Echo
     * @version 1.0
     * @description 返回系统默认失败状态值及信息
     * @updateTime 2021/12/11 22:54
     * @return: com.echo.blog.api.SystemResult
     * @throws
     */
    public static SystemResult fail(){
        return new SystemResult(REQUEST_FAIL.getCode(),REQUEST_FAIL.getMsg());
    }

    /**
     * @methodName fail
     * @author Echo
     * @param: msg
     * @version 1.0
     * @description 返回系统默认失败状态值以及自定义信息
     * @updateTime 2021/12/11 22:55
     * @return: com.echo.blog.api.SystemResult
     * @throws
     */
    public static SystemResult fail(String msg){
        return new SystemResult(REQUEST_FAIL.getCode(),msg);
    }

    /**
     * @methodName fail
     * @author Echo
     * @param: code
     * @param: msg
     * @version 1.0
     * @description 返回系统自定义失败状态值以及信息
     * @updateTime 2021/12/11 22:56
     * @return: com.echo.blog.api.SystemResult
     * @throws
     */
    public static SystemResult fail(int code, String msg){
        return new SystemResult(code,msg);
    }

}
