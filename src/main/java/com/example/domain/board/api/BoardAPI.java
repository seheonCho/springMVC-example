package com.example.domain.board.api;

import com.example.domain.board.service.BoardService;
import com.example.domain.board.vo.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardAPI {

    private BoardService boardService;

    public BoardAPI(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public List<BoardVO> list() {
        return boardService.list();
    }

}
