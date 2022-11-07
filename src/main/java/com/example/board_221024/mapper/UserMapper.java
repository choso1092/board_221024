package com.example.board_221024.mapper;

import com.example.board_221024.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void saveUser(UserVo userVo);
}
