package com.simple.board.dao;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardDAO {
	void regist(BoardVO vo);
	ArrayList<BoardVO> getList();
	void delete(String num);
}
