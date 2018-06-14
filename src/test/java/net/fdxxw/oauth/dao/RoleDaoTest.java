package net.fdxxw.oauth.dao;

import net.fdxxw.oauth.dao.mybatis.RoleDao;
import net.fdxxw.oauth.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleDaoTest {

    @Resource
    private RoleDao roleDao;

    @Test
    public void insertTest() {

       Role role = new Role();
       role.setRoleName("user");
       role.setCreateDate(new Date());
       role.setAlterDate(new Date());

       Integer roleId = roleDao.insert(role);

        System.out.println(roleId);
    }
}
