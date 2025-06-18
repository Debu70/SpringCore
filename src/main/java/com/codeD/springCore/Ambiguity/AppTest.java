package com.codeD.springCore.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeD/springProj/Ambiguity/config.xml");
		AmbiguityMethod am = (AmbiguityMethod) context.getBean("sum1");
		am.doSum();
	}
}
