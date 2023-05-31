package com.hi.board.mapper;

import com.hi.board.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {



//    select
    List<BoardDTO> selectList(PageOption pageOption);
    // selectList(0,5)  #{param1} => 0, #{param2} => 5

    int selectTotalCount(BoardSearchOption searchOption);

    List<BoardDTO> selectAll();

    BoardDTO selectByBno(int bno);


    int insertBoard(RequestRegBoard requestRegBoard);

    int updateBoard(RequestModifyRequest modifyRequest);

    int deleteByBno(int bno);


}
