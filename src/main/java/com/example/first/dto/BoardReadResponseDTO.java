package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardReadResponseDTO {
    private Long boardId;
    private String title;
    private String content;
    private String email;

    @Builder
    public BoardReadResponseDTO(Long boardId, String title, String content, String email) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.email = email;
    }
}
