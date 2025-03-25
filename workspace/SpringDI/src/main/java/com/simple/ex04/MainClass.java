package com.simple.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("autowired-context.xml");
		
		
		Printer printer = ctx.getBean(Printer.class);
		
		System.out.println( printer.getDocument().data  );
		
		
		
	}
}
