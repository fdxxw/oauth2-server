package net.fdxxw.oauth.dao.mybatis;

import net.fdxxw.oauth.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xingxiaowen on 2018/06/09
 */
@Mapper
public interface RoleDao extends SuperMapper<Role> {

    @Select("select r.* from role as r, user_role as ur where r.role_id = ur.role_id and ur.user_id = #{userId}")
    List<Role> findByUserId(Integer userId);

}
