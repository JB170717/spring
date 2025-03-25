package com.simple.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		Chef chef =new Chef();
//		Hotel hotel =new Hotel(chef);
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("application-context.xml");
		
		//1st 이름으로 탐지
//		Hotel hotle=(Hotel)ctx.getBean("hotel");
//		hotle.getChef().cooking();
		
		//2nd 클래스로 탐지
		//Hotle hotel = ctx.getBean(Hotel.class);
		
		//3rd
		Hotel hotel =ctx.getBean("hotel", Hotel.class);
		hotel.getChef().cooking();
		
		
	}
	
}
