package com.simple.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		Hello h = new Hello();
//		h.sayHello();
		
		//스프링이 추구하는 방식으로
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
		Hello h = (Hello)ctx.getBean("gildong");
		h.sayHello();
		
		
		
		
	}
}
