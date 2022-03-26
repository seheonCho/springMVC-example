package com.example.domain.board.vo;

import java.sql.Timestamp;

public class BoardVO {

    private long seq;
    private String title;
    private String content;
    private long writer;
    private String password;
    private Timestamp regDate;
    private int hit;

    public BoardVO(String title, String content, long writer, String password) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.password = password;
    }

    public long getSeq() {
        return seq;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public long getWriter() {
        return writer;
    }

    public String getPassword() {
        return password;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public int getHit() {
        return hit;
    }
}
