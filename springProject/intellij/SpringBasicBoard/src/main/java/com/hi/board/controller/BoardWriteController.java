package com.hi.board.controller;

import com.hi.board.domain.RequestRegBoard;
import com.hi.board.service.BoardWriteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
@RequestMapping("/board/write")
public class BoardWriteController {
    @Autowired
    private BoardWriteService writeService;

    @GetMapping
    public void getWriteForm() {
        log.info("GET  /board/write");


    }

    @PostMapping
    public String write(
            RequestRegBoard board
    ) {
        log.info("POST /board/write");
        log.info(board);

        int service = writeService.writeBoard(board);

        log.info("writeService "+ (service!=0 ? "PASS" : "FAILED"));

        return "redirect:/board/list";
    }


}
