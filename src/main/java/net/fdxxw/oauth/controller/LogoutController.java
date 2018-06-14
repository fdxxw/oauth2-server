package net.fdxxw.oauth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@Slf4j
@RequestMapping("/")
public class LogoutController {

    @Resource
    @Qualifier("consumerTokenServices")
    ConsumerTokenServices consumerTokenServices;

    @RequestMapping("oauth/logout")
    public void logout(HttpServletResponse response, HttpServletRequest request) {
        // token can be revoked here if needed
        //consumerTokenServices.revokeToken("");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        new SecurityContextLogoutHandler().logout(request, response, auth);
        try {
            //sending back to client app
            response.sendRedirect("/login");
        } catch (IOException e) {
            log.error("", e);
        }
    }
}
