package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@Log4j2
@RequestMapping("/cookie")
public class CookieController {

    @RequestMapping("/make")
    public String makeCookie(
            HttpServletResponse response
    ) {

        // 쿠키생성 -> 응답
        Cookie cookie = new Cookie("userid", "cool");
        // 경로설정
        cookie.setPath("/");
        // 유지시간 설정
        cookie.setMaxAge(60*60);

        response.addCookie(cookie);
        return "cookie/make";

    }
    // /cookie/view
    @RequestMapping("/view")
    public String viewCookie(
            @CookieValue("userid") String userid,
            @CookieValue(value = "auth",defaultValue = "not") String auth,
            @RequestHeader("Referer") String referer,
            Model model
    ){
        log.info("GET   /cookie/view");
        log.info("userid : "+userid);
        log.info("cookie : auth =" + auth);

        log.info("이전페이지 : "+referer);

        model.addAttribute("userid",userid);
        model.addAttribute("auth",auth);

        return "cookie/view";
    }

}
