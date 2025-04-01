package com.simple.score.dao;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreDAO {
	void regist(ScoreVO vo); //insert 
	ArrayList<ScoreVO> getList(); //select
	void delete(String sno); //delete
	
}
