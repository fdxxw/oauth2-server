package net.fdxxw.oauth.dao;

import net.fdxxw.oauth.dao.mybatis.UserDao;
import net.fdxxw.oauth.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void findByUserNameTest() {

        User user = userDao.findByName("");

        System.out.println(user);
    }
}
