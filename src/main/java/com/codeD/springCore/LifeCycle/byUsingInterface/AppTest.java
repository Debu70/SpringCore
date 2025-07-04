package com.codeD.springCore.LifeCycle.byUsingInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/codeD/springProj/LifeCycle/byUsinginterface/config.xml");
		Employee emp1 = context.getBean("Employee1", Employee.class);
		System.out.println(emp1);
		context.registerShutdownHook();
	}
}
