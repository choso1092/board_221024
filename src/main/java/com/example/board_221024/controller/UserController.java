package com.example.board_221024.controller;

import com.example.board_221024.service.UserService;
import com.example.board_221024.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/join")
    public String signUPForm(){
        return "join";
    }
    @PostMapping("/join")
    public String singUP(UserVo userVo){
        userService.joinUser(userVo);
        return "redirect:/login";
    }
}
