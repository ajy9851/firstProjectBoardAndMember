package com.example.first.service;
import com.example.first.domain.Board;
import com.example.first.dto.*;
import com.example.first.repository.BoardRepository;
import com.example.first.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public BoardCreateResponseDTO createBoard(BoardCreateRequestDTO boardCreateRequestDTO) {
        Board board = boardCreateRequestDTO.boardDtoToEntity(boardCreateRequestDTO);
        board.boardSetMember(memberRepository.findByEmail(boardCreateRequestDTO.getEmail()));
        boardRepository.save(board);
        return BoardCreateResponseDTO.builder()
                .email(boardCreateRequestDTO.getEmail())
                .title(boardCreateRequestDTO.getTitle())
                .content(boardCreateRequestDTO.getContent())
                .boardId(board.getBoardId())
                .build();
    }
}
