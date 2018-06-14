package net.fdxxw.oauth.dao.mybatis;

import net.fdxxw.oauth.entity.App;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xingxiaowen on 2018/06/09
 */
@Mapper
public interface AppDao extends SuperMapper<App> {

    @Select("select a.* from app as a, user_app as ua where a.app_id = ua.app_id and ua.user_id = #{userId}")
    List<App> findByUserId(Integer userId);
}
