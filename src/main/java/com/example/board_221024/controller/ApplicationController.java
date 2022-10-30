package com.example.board_221024.controller;

import com.example.board_221024.service.UserService;
import com.example.board_221024.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ApplicationController {
    @Autowired
    UserService userService;

    @RequestMapping({"/", ""})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        List<UserVo> userList = userService.getUser();
        mv.addObject("userList", userList);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping({"/join"})
    public ModelAndView join() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("join");
        return mv;
    }
}