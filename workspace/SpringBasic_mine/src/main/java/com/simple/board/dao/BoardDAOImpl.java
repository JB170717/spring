package com.simple.board.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("bdao")
public class BoardDAOImpl implements BoardDAO{

	private ArrayList<BoardVO> list = new ArrayList<>();
	
	@Override
	public void regist(BoardVO vo) {
		list.add(vo);		
		System.out.println(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		
		return list;
	}

	@Override
	public void delete(String num) {
		
		list.remove(Integer.parseInt(num));
	}

}
