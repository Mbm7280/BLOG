package com.echo.blog.modules.ums.service.impl;

import com.echo.blog.modules.ums.model.UmsUser;
import com.echo.blog.modules.ums.mapper.UmsUserMapper;
import com.echo.blog.modules.ums.service.UmsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
