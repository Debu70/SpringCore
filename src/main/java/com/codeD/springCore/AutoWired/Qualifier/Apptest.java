package com.codeD.springCore.AutoWired.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apptest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeD/springCore/Autowired/Qualifier/config.xml");
		ClassRoom classRoom = context.getBean("classRoom",ClassRoom.class);
		System.out.println(classRoom);
	}
}
