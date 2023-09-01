package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardUpdateContentResponseDTO {
    private String content;
    private Long boardId;

    @Builder
    public BoardUpdateContentResponseDTO(String content, Long boardId) {
        this.content = content;
        this.boardId = boardId;
    }
}
