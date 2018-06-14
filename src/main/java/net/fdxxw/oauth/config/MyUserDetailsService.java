package net.fdxxw.oauth.config;

import lombok.extern.slf4j.Slf4j;
import net.fdxxw.oauth.entity.Role;
import net.fdxxw.oauth.entity.User;
import net.fdxxw.oauth.service.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * 加载用户信息服务实现
 * Created by xingxiaowen on 2018/06/10
 */
@Slf4j
@Service("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = null;
        try {
            user = userService.getUserByName(userName);
        } catch (Exception e) {
            log.error("",e);
        }

        if(user == null) {
            throw new UsernameNotFoundException("");
        }

        Collection<SimpleGrantedAuthority> simpleGrantedAuthorities =
                user.getRoles().stream()
                        .map(role -> new SimpleGrantedAuthority(role.getRoleName()))
                        .collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(user.getUserName(), "{noop}" + user.getPassword(), simpleGrantedAuthorities);
    }
}
