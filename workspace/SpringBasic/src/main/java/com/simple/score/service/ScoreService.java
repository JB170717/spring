package com.simple.score.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreService {
	void regist(ScoreVO vo); //insert
	ArrayList<ScoreVO> getList(); //select
	void delete(String sno); //delete
}
