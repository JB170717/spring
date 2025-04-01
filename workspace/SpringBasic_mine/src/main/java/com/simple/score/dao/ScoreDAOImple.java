package com.simple.score.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("scoreDAO") //컴포넌트 스캔에 읽힘
public class ScoreDAOImple implements ScoreDAO{

	//디비라고 가정
	private ArrayList<ScoreVO> list =new ArrayList<>();
	
	@Override
	public void regist(ScoreVO vo) {	
		list.add(vo);  //insert라고 가정
	}

	@Override
	public ArrayList<ScoreVO> getList() {
		
		return list;
	}

	@Override
	public void delete(String sno) {
		list.remove(Integer.parseInt(sno)); // 인덱스번호로 삭제
		
	}

}
