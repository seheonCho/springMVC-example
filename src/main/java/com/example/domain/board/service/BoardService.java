package com.example.domain.board.service;

import com.example.domain.board.vo.BoardVO;

import java.util.List;

public interface BoardService {

    public abstract List<BoardVO> list();

    public abstract BoardVO read(long seq);

    public abstract long write(BoardVO boardVO);

}
