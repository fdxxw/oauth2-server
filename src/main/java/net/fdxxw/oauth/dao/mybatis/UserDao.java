package net.fdxxw.oauth.dao.mybatis;

import net.fdxxw.oauth.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

/**
 * Created by xingxiaowen on 2018/06/09
 */
@Mapper
public interface UserDao extends SuperMapper<User> {

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "roles", column = "user_id",
                    many = @Many(select = "net.fdxxw.oauth.dao.mybatis.RoleDao.findByUserId", fetchType = FetchType.DEFAULT)),
            @Result(property = "apps", column = "user_id",
                    many = @Many(select = "net.fdxxw.oauth.dao.mybatis.AppDao.findByUserId", fetchType = FetchType.DEFAULT))
    })
    @Select("select * from users where user_name = #{userName}")
    User findByName(String userName);
}
