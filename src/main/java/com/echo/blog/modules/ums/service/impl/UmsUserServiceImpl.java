package com.echo.blog.modules.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.echo.blog.modules.ums.model.UmsUser;
import com.echo.blog.modules.ums.mapper.UmsUserMapper;
import com.echo.blog.modules.ums.service.UmsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Echo
 * @since 2021-12-13
 */
@Service
public class UmsUserServiceImpl extends ServiceImpl<UmsUserMapper, UmsUser> implements UmsUserService {

    @Autowired
    private UmsUserMapper userMapper;

    /**
     * @className UmsUserServiceImpl
     * @author Echo
     * @description 查询所有用户
     * @updateTime 2021/12/14 19:48
     * @return: java.util.List<com.echo.blog.modules.ums.model.UmsUser>
     * @version 1.0
     */
    @Override
    public List<UmsUser> qAllUsers() {
        return userMapper.selectList(new QueryWrapper<>());
    }
}
