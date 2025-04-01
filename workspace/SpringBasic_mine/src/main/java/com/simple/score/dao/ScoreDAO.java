package com.simple.score.dao;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreDAO {
	void regist(ScoreVO vo); //insert할 용도
	ArrayList<ScoreVO> getList(); //select모형
	void delete(String sno); //delete모형
}
