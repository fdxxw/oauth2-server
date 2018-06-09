package net.fdxxw.oauth.dao.mybatis;

import net.fdxxw.oauth.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by xingxiaowen on 2018/06/09
 */
@Mapper
public interface UserDao {

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    @Results({
            @Result(property = "roles", column = "user_id",
                    many = @Many(select = "net.fdxxw.dao.mybatis.RoleDao.findByUserId")),
            @Result(property = "apps", column = "user_id",
                    many = @Many(select = "net.fdxxw.dao.mybatis.AppDao.findByUserId"))
    })
    @Select("select * from \"user\" where user_name = #{userName}")
    User findByName(String userName);
}
