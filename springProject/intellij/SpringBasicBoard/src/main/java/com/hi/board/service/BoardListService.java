package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class BoardListService {
    @Autowired
    private BoardMapper boardMapper;

    public List<BoardDTO> getBoardList(){
        return boardMapper.selectAll();
    }

}
