package com.simple.score.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreService {

	void regist(ScoreVO vo); //insert할 용도
	ArrayList<ScoreVO> getList(); //select모형
	void delete(String sno); //delete모형
	
}
