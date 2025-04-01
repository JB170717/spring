package com.simple.score.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreDAO;
import com.simple.score.dao.ScoreMapper;

@Service("이름") //@Service어노테이션을 붙이고, 패키지를 읽어서 빈으로 만드는 전략
public class ScoreServiceImpl implements ScoreService {
	
	private static final Logger log = LoggerFactory.getLogger(ScoreServiceImpl.class);
	
	

//	@Autowired
//	@Qualifier("scoreDAO")
//	private ScoreDAO scoreDAO;
	

	@Autowired
	private ScoreMapper scoreMapper;
		
	
	@Override
	public void regist(ScoreVO vo) {
		
		log.info("serviceImpl에 리지스트 메서드 동작함");		
		scoreMapper.insertTwo(vo);
		
	}
	
	@Override
	public ArrayList<ScoreVO> getList() {
		return scoreMapper.selectThree();
	}

	@Override
	public void delete(String sno) {
		scoreMapper.deleteOne(sno);
	}

}







