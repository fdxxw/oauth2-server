package net.fdxxw.oauth.entity;

import lombok.Data;

/**
 * 用户和app关联
 * Created by xingxiaowen on 2018/06/09
 */
@Data
public class UserApp {

    private Long userAppId;

    private Long userId;

    private String appId;
}
