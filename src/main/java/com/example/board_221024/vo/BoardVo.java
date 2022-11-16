package com.example.board_221024.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVo {
    private int boardNumber;
    private String userId;
    private String title;
    private String content;
    private String boardTime;
    private String registerId;

}
