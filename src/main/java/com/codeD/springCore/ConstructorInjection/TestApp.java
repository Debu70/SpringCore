package com.codeD.springCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/codeD/springProj/ConstructorInjection/config.xml");
		EmployeeDAO Employee = (EmployeeDAO)context.getBean("Employee1");
		System.out.println(Employee);
	}
}
