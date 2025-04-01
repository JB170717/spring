package com.simple.score.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

@Mapper //매퍼임을 명시함
public interface ScoreMapper {

	String getTime();
	//update, delete, select에도 모두 동일하게 적용됨
	int insertOne(String name); //매개변수가 1개일 때 ( #{name} )
	int insertTwo(ScoreVO vo); //매개변수가 DTO일 때 ( #{getter명} )
	int insertThree(Map<String, Object> map); //매개변수가 map ( #{key값} )
	int insertFour(@Param("name") String name,
				   @Param("kor") String kor,
				   @Param("eng") String eng); //매개변수가 여러개면 @Param("이름")
	
	ScoreVO selectOne(int sno); //반환을 VO(DTO)
	HashMap<String, Object> selectTwo(int sno); //반환을 map
	ArrayList<ScoreVO> selectThree(); //여러행 select
	ArrayList<HashMap<String, Object>> selectFour();
	//update메서드
	int updateOne(ScoreVO vo);
	//delete메서드
	int deleteOne(String sno);
	
	
	
	
	
}








