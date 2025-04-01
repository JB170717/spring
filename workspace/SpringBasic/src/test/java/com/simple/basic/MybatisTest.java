package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //로딩시킬 스프링 설정파일
public class MybatisTest {
	
	@Autowired
	private ScoreMapper scoreMapper;
	
//	@Test
//	public void test01() {
//		
//		String time = scoreMapper.getTime();
//		System.out.println(time);
//	}
	
	//insert
	/*
	@Test
	public void test02() {
		
//		int result = scoreMapper.insertOne("이순신");
		
//		ScoreVO vo = new ScoreVO(0, "유경초이", "10", "20", "30");
//		int result = scoreMapper.insertTwo(vo);
		
//		Map<String, Object> map = new HashMap<>();
//		map.put("name", "홍길자");
//		map.put("kor", "100");
//		map.put("eng", "100");
//		map.put("math", "100");
//		int result = scoreMapper.insertThree(map);
		
		int result = scoreMapper.insertFour("이름", "50", "50");
		
		System.out.println("성공실패:" + result);
	}
	*/
	
//	@Test
//	public void test03() {
//		//ScoreVO vo = scoreMapper.selectOne(3);
//		//System.out.println(vo.toString());
//		
//		//Map<String, Object> map = scoreMapper.selectTwo(3);
//		//System.out.println(map.toString());
//		
//		//ArrayList<ScoreVO> list = scoreMapper.selectThree();
//		//System.out.println(list.toString());
//		
//		ArrayList<HashMap<String, Object>> list = scoreMapper.selectFour();
//		System.out.println(list.toString());
//		
//	}
	
	
	//update-실습
	@Test
	public void test04() {
		//vo를 통해서 업데이트 할 값을 전달 받고, vo의 번호를 update하는 sql문을 작성합니다
		//업데이트 여부는 정수형으로 받아오는 mybatis구문을 작성해보세요.
		
		ScoreVO vo = new ScoreVO(3, "유경초이", "100", "100", "100");
		int result = scoreMapper.updateOne(vo);
		System.out.println("성공실패:" + result);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
