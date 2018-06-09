package net.fdxxw.oauth.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * oauth2 user
 * Created by xingxioawen on 2018/06/09
 */
@Data
public class User implements Serializable {
    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 用户名称
     */

    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户角色集合
     */
    private List<Role> roles;

    /**
     * 用户app集合
     */
    private List<App> apps;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date alterDate;
}
