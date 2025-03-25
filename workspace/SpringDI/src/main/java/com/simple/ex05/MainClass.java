package com.simple.ex05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.simple.ex02.Hotel;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Hotel hotel = ctx.getBean(Hotel.class);
		hotel.getChef().cooking();
	}
	
}
