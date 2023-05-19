package com.hi.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardDeleteController {
    @RequestMapping("/board/delete")
    public String deleteBoard(
        @RequestParam("bno") int bno
    ){


        return "redirect:/board/list";
    }


}
