package com.example.domain.board.repository;

import com.example.domain.board.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepository implements BoardDao {

    private SqlSessionTemplate sqlSession;

    public BoardRepository(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<BoardVO> list() {
        return sqlSession.selectList("list");
    }

    @Override
    public BoardVO select(long seq) {
        return sqlSession.selectOne("select", seq);
    }

    @Override
    public long insert(BoardVO boardVO) {
        return sqlSession.update("insert", boardVO);
    }

    @Override
    public int updateHitCount(long seq) {
        return sqlSession.update("updateHit", seq);
    }
}
