package com.codeD.springCore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeD/springProj/reference/config.xml");
		Car car1 = (Car) context.getBean("car");
		System.out.println(car1);
		
		
	}
}
