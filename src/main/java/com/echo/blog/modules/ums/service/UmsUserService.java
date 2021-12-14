package com.echo.blog.modules.ums.service;

import com.echo.blog.modules.ums.model.UmsUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Echo
 * @since 2021-12-13
 */
public interface UmsUserService extends IService<UmsUser> {


    /**
     * @author Echo
     * 查询所有用户
     */
    List<UmsUser> qAllUsers();


}
