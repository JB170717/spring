package com.simple.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	/*
	 * Printer객체가 생성될때 @Autowired에 의해서 적합한 빈객체가 자동으로 주입.
	 * @Autowired는 객체를 탐지할 때
	 * 타입 -> 이름 으로 찾게 됩니다.
	 *
	 * 생성자, 세터, 멤버변수에 적용할 수 있음.
	 *
	 * @Resource
	 * @Inject
	 * 어노테이션 같은 역할을 함
	 */
	@Autowired(required = false)
	@Qualifier("doc1") //적합한 빈 이름으로 강제 연결
	private Document document;
	
	//
	public Printer() {
	}
	
	//생성자
	public Printer(Document document) {
		this.document = document;
	}

	//getter/setter
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	
	
	
}
