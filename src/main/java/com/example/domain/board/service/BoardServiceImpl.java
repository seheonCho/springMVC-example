package com.example.domain.board.service;

import com.example.domain.board.repository.BoardDao;
import com.example.domain.board.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private BoardDao boardDao;

    public BoardServiceImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public List<BoardVO> list() {
        return boardDao.list();
    }

    @Override
    public BoardVO read(long seq) {
        boardDao.updateHitCount(seq);
        return boardDao.select(seq);
    }

    @Override
    public long write(BoardVO boardVO) {
        return boardDao.insert(boardVO);
    }
}
