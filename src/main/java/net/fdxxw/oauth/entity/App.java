package net.fdxxw.oauth.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * 用户应用, client
 * Created by xingxiaowen on 2018/06/09
 */
@Data
public class App {

    /**
     * 应用id
     */
    private String appId;

    /**
     * 应用密钥
     */
    private String appSecret;

    /**
     * 应用名称
     */
    private String appName;

    /**
     *
     */
    private Set<String> scopes;

    /**
     *
     */
    private Set<String> grantType;

    /**
     *
     */
    private String registeredRedirectUri;

    /**
     *
     */
    private List authorities;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date alterDate;

}
