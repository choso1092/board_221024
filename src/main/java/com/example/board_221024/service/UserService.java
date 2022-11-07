package com.example.board_221024.service;

import com.example.board_221024.mapper.UserMapper;
import com.example.board_221024.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
//@Resource(name="userMapper")
public class UserService {
    @Autowired
    UserMapper userMapper;

    @Transactional
    public void joinUser(UserVo userVo){
        userVo.setUserId("");
        userVo.setUserPassword("");
        userVo.setUserName("");
        userVo.setPhoneNumber("");
        userVo.setUserAddress("");
        userMapper.saveUser(userVo);

    }

}
