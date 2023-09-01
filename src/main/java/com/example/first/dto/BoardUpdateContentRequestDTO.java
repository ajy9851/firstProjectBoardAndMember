package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardUpdateContentRequestDTO {
    private String content;
    private Long boardId;
    private String email;

    @Builder
    public BoardUpdateContentRequestDTO(String content, Long boardId, String email) {
        this.content = content;
        this.boardId = boardId;
        this.email = email;
    }
}
