package com.example.first.controller;

import com.example.first.dto.*;
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

    @PutMapping("/update/title/{boardId}")
    public ResponseEntity updateTitle(@PathVariable Long boardId, @RequestBody BoardUpdateTitleRequestDTO boardUpdateTitleRequestDTO) {
        BoardUpdateTitleResponseDTO boardUpdateTitleResponseDTO = boardService.updateTitle(boardUpdateTitleRequestDTO);
        return ResponseEntity.ok(boardUpdateTitleResponseDTO);
    }

    @PutMapping("/update/content/{boardId}")
    public ResponseEntity updateContent(@PathVariable Long boardId, @RequestBody BoardUpdateContentRequestDTO boardUpdateContentRequestDTO) {
        BoardUpdateContentResponseDTO boardUpdateContentResponseDTO = boardService.updateContent(boardUpdateContentRequestDTO);
        return ResponseEntity.ok(boardUpdateContentResponseDTO);
    }

    @DeleteMapping("/delete/{boardId}")
    public ResponseEntity deleteBoard(@PathVariable Long boardId){
        boardService.boardDelete(boardId);
        return ResponseEntity.ok("succses");
    }


}
