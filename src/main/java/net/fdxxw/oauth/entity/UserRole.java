package net.fdxxw.oauth.entity;

import lombok.Data;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * 用户角色关联
 * Created by xingxiaowen on 2018/06/09
 */
@Data
public class UserRole {

    private Integer userRoleId;

    private Integer userId;

    private Integer roleId;
}
