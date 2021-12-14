package com.echo.blog.modules.ums.controller;


import com.echo.blog.modules.ums.model.UmsUser;
import com.echo.blog.modules.ums.service.UmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Echo
 * @since 2021-12-13
 */
@RestController
@RequestMapping("/ums/umsUser")
public class UmsUserController {

    @Autowired
    private UmsUserService userService;

    /**
     * @className UmsUserController
     * @author Echo
     * @description 查询所有用户
     * @updateTime 2021/12/14 20:09
     * @return: java.util.List<com.echo.blog.modules.ums.model.UmsUser>
     * @version 1.0
     */
    @GetMapping(value = "/listAllUsers")
    public List<UmsUser> listAllUsers(){
        return userService.qAllUsers();
    }

}

