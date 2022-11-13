package com.example.board_221024.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchBoardDTO {
    private String searchKey;
    private String searchValue;

}
