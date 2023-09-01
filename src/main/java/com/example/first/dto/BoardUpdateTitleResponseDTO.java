package com.example.first.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardUpdateTitleResponseDTO {
    private String title;
    private Long boardId;

    @Builder
    public BoardUpdateTitleResponseDTO(String title, Long boardId){
        this.title = title;
        this.boardId = boardId;
    }
}
