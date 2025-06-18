package com.codeD.springCore.StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/codeD/springProj/StereoType/config.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}
}
