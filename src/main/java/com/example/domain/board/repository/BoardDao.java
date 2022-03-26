package com.example.domain.board.repository;

import com.example.domain.board.vo.BoardVO;

import java.util.List;

public interface BoardDao {

    public abstract List<BoardVO> list();

    public abstract BoardVO select(long seq);

    public abstract long insert(BoardVO boardVO);

    public abstract int updateHitCount(long seq);
}
