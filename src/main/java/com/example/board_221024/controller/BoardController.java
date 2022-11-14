package com.example.board_221024.controller;

import com.example.board_221024.DTO.SearchBoardDTO;
import com.example.board_221024.service.BoardService;
import com.example.board_221024.vo.BoardVo;
import com.example.board_221024.vo.CommonResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;
    @RequestMapping({"", "/"})
    public ModelAndView boardPage(String userId){
        ModelAndView mv = new ModelAndView();
        mv.addObject("userId", userId);
        mv.setViewName("board/board");
        return mv;
    }

    @RequestMapping("/boardWrite")
    public ModelAndView createPage(String userId){
        ModelAndView mv = new ModelAndView();
        mv.addObject("userId", userId);
        mv.setViewName("board/boardWrite");
        return mv;
    }

    @RequestMapping("/create")
    @ResponseBody
    public CommonResponseVo createBoard(BoardVo param){
        CommonResponseVo r = new CommonResponseVo();
        try {
            boardService.createBoard(param);
            r.setSuccess(true);
        } catch(Exception e){
            System.out.println(e);
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }

    @RequestMapping("/getBoardList")
    @ResponseBody
    public CommonResponseVo viewBoard(SearchBoardDTO searchBoardDTO){
        CommonResponseVo r = new CommonResponseVo();
        try{
            List<BoardVo> boardVList = boardService.getBoardList(searchBoardDTO);
            r.setSuccess(true);
            r.setData(boardVList);
        } catch(Exception e){
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }
}
