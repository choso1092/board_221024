package com.example.board_221024.service;

import com.example.board_221024.mapper.UserMapper;
import com.example.board_221024.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Resource(name="userMapper")
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserVo> getUser() {
        List<UserVo> list = new ArrayList<>();
        userMapper.getUser();
        return list;
    }
}
