package com.example.domain.board.controller;

import com.example.domain.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

//    @RequestMapping(value = "/board/list", method = RequestMethod.GET)
    @RequestMapping(value = "/board/list")
    @ResponseBody
    public String list() {
//        model.addAttribute("boardList", boardService.list());
//        return "/board/list";
        return boardService.list().toString();
    }

}
