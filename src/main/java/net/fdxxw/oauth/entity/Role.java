package net.fdxxw.oauth.entity;

import lombok.Data;

import java.util.Date;

/**
 * 角色
 * Created by xingxiaowen on 2018/06/09
 */
@Data
public class Role {

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date alterDate;
}
