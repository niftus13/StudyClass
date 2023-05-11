package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class TodoReadController {
@RequestMapping("/todo/read")
    public void getRead(){
        log.info("getRead");

    }

}
