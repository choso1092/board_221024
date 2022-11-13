package com.example.board_221024.mapper;

import com.example.board_221024.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper
public interface BoardMapper {

    void createBoard(BoardVo param);

}
