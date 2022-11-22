package com.example.board_221024.mapper;

import com.example.board_221024.DTO.SearchBoardDTO;
import com.example.board_221024.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
public interface BoardMapper {

    void createBoard(BoardVo param);

    List<BoardVo> viewList(SearchBoardDTO searchBoardDTO);
    BoardVo getBoardDetail(String boardNumber);

    void boardDelete(BoardVo param);

    void boardModify(BoardVo param);

    void changeBoard(BoardVo param);
}
