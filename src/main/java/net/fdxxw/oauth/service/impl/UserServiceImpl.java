package net.fdxxw.oauth.service.impl;

import com.baomidou.mybatisplus.toolkit.StringUtils;
import lombok.extern.slf4j.Slf4j;
import net.fdxxw.oauth.dao.mybatis.UserDao;
import net.fdxxw.oauth.entity.User;
import net.fdxxw.oauth.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xingxiaowen on 2018/06/10
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserByName(String userName) throws Exception {
        if(StringUtils.isEmpty(userName)) {
            log.error("userName参数不能为空");

            throw new IllegalArgumentException("userName参数不能为空");
        }
        return userDao.findByName(userName);
    }
}
