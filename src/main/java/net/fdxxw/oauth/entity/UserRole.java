package net.fdxxw.oauth.entity;

import lombok.Data;

/**
 * 用户角色关联
 * Created by xingxiaowen on 2018/06/09
 */
@Data
public class UserRole {

    private Long userRoleId;

    private Long userId;

    private Long roleId;
}
