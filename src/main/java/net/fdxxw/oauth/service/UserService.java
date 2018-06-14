package net.fdxxw.oauth.service;

import net.fdxxw.oauth.entity.User;

/**
 * 用户服务
 * Created by xingxiaowen on 2018/06/10
 */
public interface UserService {

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    User getUserByName(String userName) throws Exception;
}
