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

    @Transactional
    public BoardReadResponseDTO readBoard(Long boardId) {
        //읽기만 하는 것이니 .save할 필요 없다.
        Board board = boardRepository.findByBoardId(boardId);
        return BoardReadResponseDTO.builder()
                .boardId(board.getBoardId())
                .title(board.getTitle())
                .content(board.getContent())
                .email(board.getMember().getEmail())
                .build();
    }

}
