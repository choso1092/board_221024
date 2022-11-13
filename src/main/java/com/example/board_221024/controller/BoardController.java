package com.example.board_221024.controller;

import com.example.board_221024.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;
    @RequestMapping({"", "/"})
    public ModelAndView boardPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("board/board");
        return mv;
    }

    @RequestMapping("/boardWrite")
    public ModelAndView createPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("board/boardWrite");
        return mv;
    }


}
