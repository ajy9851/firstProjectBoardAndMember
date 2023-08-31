package com.example.first.controller;

import com.example.first.dto.BoardCreateRequestDTO;
import com.example.first.dto.BoardCreateResponseDTO;
import com.example.first.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/create")
    public ResponseEntity createBoard(@RequestBody BoardCreateRequestDTO boardCreateRequestDTO) {
        BoardCreateResponseDTO boardCreateResponseDTO = boardService.createBoard(boardCreateRequestDTO);
        return ResponseEntity.ok(boardCreateResponseDTO);
    }
}
