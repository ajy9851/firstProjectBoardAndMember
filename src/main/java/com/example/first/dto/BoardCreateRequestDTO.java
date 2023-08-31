package com.example.first.dto;

import com.example.first.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardCreateRequestDTO {
    private String email;
    private String title;
    private String content;


    @Builder
    public BoardCreateRequestDTO(String email, String title, String content) {
        this.email = email;
        this.title = title;
        this.content = content;
    }

    public Board boardDtoToEntity(BoardCreateRequestDTO boardCreateRequestDTO) {
        String email = boardCreateRequestDTO.getEmail();
        String title = boardCreateRequestDTO.getTitle();
        String content = boardCreateRequestDTO.getContent();
        return Board.builder()
                .title(title)
                .content(content)
                .build();
    }
}
