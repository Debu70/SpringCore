package com.codeD.springCore.AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apptest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeD/springCore/Autowired/config.xml");
		ClassRoom classRoom = context.getBean("classRoom",ClassRoom.class);
		System.out.println(classRoom);
	}
}
