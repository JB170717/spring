package com.simple.board.service;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardService {
	void regist(BoardVO vo);
	ArrayList<BoardVO> getList();
	void delete(String num);
}
