package com.codeD.springCore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeD/springCore/SpEL/config.xml");
		Math Test = context.getBean("mathCompo",Math.class);
		System.out.println(Test);
	}
}
