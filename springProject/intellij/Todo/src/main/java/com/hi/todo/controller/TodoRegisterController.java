package com.hi.todo.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/regist")
public class TodoRegisterController {

    //get : form 페이지로 응답
    @RequestMapping(method = RequestMethod.GET)
    public String getRegistForm(){

        log.info("GET /todo/regist");
        return "/todo/registForm";
        // /WEB-INF/views/todo/registForm.jsp
    }
    //post : redirect -> "/todo/list" ,  view 필요가 없다.
    @RequestMapping(method = RequestMethod.POST)
    public String regist(){
        log.info("post /todo/regist");
        return "redirect";
        // 일반 view와 구분은 redirct : 문자열로 구분
        //
    }





}
