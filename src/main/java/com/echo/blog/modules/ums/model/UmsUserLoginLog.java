package com.echo.blog.modules.ums.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 后台用户登录日志表
 * </p>
 *
 * @author Echo
 * @since 2021-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ums_user_login_log")
@ApiModel(value="UmsUserLoginLog对象", description="后台用户登录日志表")
public class UmsUserLoginLog implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "log编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户编号")
    private Long userId;

    @ApiModelProperty(value = "用户登录的Ip")
    private String loginIp;

    @ApiModelProperty(value = "该条log的创建时间")
    private Date createTime;

    @ApiModelProperty(value = "用户登录地址")
    private String loginAddress;


}
