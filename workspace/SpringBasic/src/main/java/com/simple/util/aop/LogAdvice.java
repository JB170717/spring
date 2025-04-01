package com.simple.util.aop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect //AOP설정이야~
@Component //컴포넌트 스캔이 읽어서 빈으로 생성
public class LogAdvice {
	
	private static final Logger log = LoggerFactory.getLogger(LogAdvice.class);
	
	//메서드 이전에 동작
	//@Before("execution(* com.simple.score.service.ScoreServiceImpl*.*(..))")
	public void beforeLog() {
		log.info("메서드 동작 전에 실행됨!!");
	}
	
	//메서드 이후에 동작
	//@After("execution(* com.simple.score.service.ScoreServiceImpl*.*(..))")
	public void AfterLog() {
		log.info("메서드 동작 후에 실행됨!!");
	}
	
	//에러발생시에 동작
	//@AfterThrowing(pointcut = "execution(* com.simple.score.service.ScoreServiceImpl*.*(..))", throwing = "e")
	public void errorLog(Exception e) {
		log.info("에러 발생시에 동작함:" + e);
	}
	
	//Around = before + after + afterThrowing
	@Around("execution(* com.simple.score.service.ScoreServiceImpl*.*(..))")
	public Object arroundLog(ProceedingJoinPoint jp) {
		
		Object result = null;
		
		System.out.println("어라운드 동작함");
		
		//메서드 동작 이전에 실행되는  처리
		
		log.info("매개변수:" + Arrays.toString(jp.getArgs()));
		log.info("실행메서드:" + jp.getTarget()); 
		
		Long start = System.currentTimeMillis();
		
		
		try {
			
			result =jp.proceed();  //AOP가 부착한 메서드가 동작
			
			//메서드 동작 이후에 실행되는 처리			
			
			Long end = System.currentTimeMillis();			
			log.info("실행시간" + ((end-start)*0.001) );
			
			//로그를 남긴다
			String path = "C:\\Users\\user\\Desktop\\course\\spring\\test_log\\오늘날짜_log.txt";
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			bw.write("매개변수:" + Arrays.toString(jp.getArgs()) );
			bw.write("동작된메서드:"+jp.getTarget());
			bw.write("실행시간"+((end-start)*0.001));
			
		} catch (Throwable e) {
			e.printStackTrace();			
		} 
		
		return result;
	}
	
	
	
}
