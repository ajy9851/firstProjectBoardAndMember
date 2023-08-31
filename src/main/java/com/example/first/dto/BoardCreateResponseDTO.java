package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardCreateResponseDTO {
    private String title;
    private String content;
    private String email;
    private Long boardId;

    @Builder
    public BoardCreateResponseDTO(String title, String content, String email, Long boardId) {
        this.title = title;
        this.content = content;
        this.email = email;
        this.boardId = boardId;
    }
}
