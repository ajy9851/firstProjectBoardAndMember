package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardUpdateTitleRequestDTO {
    private String email;
    private Long boardId;
    private String newTitle;

    @Builder
    public BoardUpdateTitleRequestDTO(String email, Long boardId, String newTitle) {
        this.email = email;
        this.boardId = boardId;
        this.newTitle = newTitle;
    }
}
