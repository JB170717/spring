package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.board.service.BoardService;
import com.simple.command.BoardVO;
import com.simple.score.service.ScoreService;

@Controller
@RequestMapping("/board")
public class BoardController {

	//2nd - BoardServiceImpl클래스를 빈으로 등록하고, 자바 문서에서 오토와이어드 넣어도 됨
	@Autowired
	@Qualifier("bs") //빈이름으로 연결함
	private BoardService boardService;
	
	@RequestMapping("/boardForm")
	public String boardForm(BoardVO vo) {
		
		boardService.regist(vo);
		return "board/boardResult";
	}
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list",list);
		
		return "board/boardList";
	}
	
	@RequestMapping("/boardRegister")
	public String boardRegister(BoardVO vo) {	
		
		
		return "board/boardRegister";
	}
	
	@RequestMapping("/boardResult")
	public String boardResult() {
		
		return "board/boardResult";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelelte(@RequestParam("num") String num) {
		
		boardService.delete(num);
		return "redirect:/board/boardList";
	}
	
	
	
}
