package com.example.first.controller;

import com.example.first.dto.BoardCreateRequestDTO;
import com.example.first.dto.BoardCreateResponseDTO;
import com.example.first.dto.BoardReadResponseDTO;
import com.example.first.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/read/{boardId}")
    public ResponseEntity readBoard(@PathVariable Long boardId) {
        BoardReadResponseDTO boardReadResponseDTO = boardService.readBoard(boardId);
        return ResponseEntity.ok(boardReadResponseDTO);
    }
}
