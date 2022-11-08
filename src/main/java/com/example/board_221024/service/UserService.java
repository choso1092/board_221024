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

    public void joinUser(UserVo userVo){
        Integer count = getUserCountByUserId(userVo.getUserId());

        if (count == 0 ) {
            userMapper.joinUser(userVo);
        }
    }
    public Integer getUserCountByUserId(String userId) {
        return userMapper.duplicateUserByUserId(userId);
    }
}
