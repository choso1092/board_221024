package com.example.board_221024.service;

import com.example.board_221024.DTO.SearchBoardDTO;
import com.example.board_221024.mapper.BoardMapper;
import com.example.board_221024.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    public void createBoard(BoardVo boardVo){
        boardMapper.createBoard(boardVo);
    }

    public List<BoardVo> getBoardList(SearchBoardDTO searchBoardDTO){
        return boardMapper.viewList(searchBoardDTO);
    }
    public BoardVo getBoardDetail(String boardNumber){
        return boardMapper.getBoardDetail(boardNumber);
    }
    public void boardDelete(BoardVo param){
        boardMapper.boardDelete(param);
    }

    public void changeBoard(BoardVo param){boardMapper.changeBoard(param);}
}
