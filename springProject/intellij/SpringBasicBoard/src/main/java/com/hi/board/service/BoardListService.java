package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.BoardListPage;
import com.hi.board.domain.BoardSearchOption;
import com.hi.board.domain.PageOption;
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

    private final int countPerPage = 5;

    public List<BoardDTO> getBoardList(){
        return boardMapper.selectAll();
    }


    public BoardListPage getPage(int pageNum , BoardSearchOption searchOption){
        // 현재 요청 페이지
        int requestPageNum = pageNum;

        PageOption pageOption = PageOption.builder()
                .searchOption(searchOption)
                .startNum((requestPageNum-1)*countPerPage)
                .count(countPerPage)
                .build();

        // 요청 페이지의 리스트 항목 : List<BoardDTO>
//        List<BoardDTO> list = boardMapper.selectList((requestPageNum-1)*countPerPage,countPerPage);
        List<BoardDTO> list = boardMapper.selectList(pageOption);
        int totalCount = boardMapper.selectTotalCount(searchOption);
        // 전체 게시글 개수 -> 전체 페이지의 개수

        BoardListPage page = new BoardListPage(
                countPerPage,
                requestPageNum,
                list,
                totalCount
        );
        return page;
    }


}
