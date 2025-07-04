package com.codeD.springCore.LifeCycle.byAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest  {

	public static void main(String[] args) {
	
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/codeD/springProj/LifeCycle/byAnnotation/config.xml");
		Student student1 =  context.getBean("Student1", Student.class);
		System.out.println(student1); 
		context.registerShutdownHook();
	}

}
