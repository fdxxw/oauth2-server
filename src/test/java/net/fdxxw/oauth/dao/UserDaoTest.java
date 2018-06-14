package net.fdxxw.oauth.dao;

import net.fdxxw.oauth.dao.mybatis.UserDao;
import net.fdxxw.oauth.dao.mybatis.UserRoleDao;
import net.fdxxw.oauth.entity.User;
import net.fdxxw.oauth.entity.UserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Resource
    private UserRoleDao userRoleDao;


    @Test
    public void findByUserNameTest() {

        User user = userDao.findByName("xiaowen");

        System.out.println(user);
    }

    @Test
    public void insertTest() {

        User user = new User();

        user.setUserName("xiaowen");
        user.setPassword("123456");
        user.setCreateDate(new Date());
        user.setAlterDate(new Date());

        Integer userId = userDao.insert(user);

        UserRole userRole = new UserRole();
        userRole.setUserId(userId);
        userRole.setRoleId(1);
    }
}
