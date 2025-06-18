package com.codeD.springCore.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {

		AbstractApplicationContext ticket = new ClassPathXmlApplicationContext("com/codeD/springProj/LifeCycle/config.xml");
		TicketBooking t1 = (TicketBooking) ticket.getBean("ticket");
		System.out.println(t1);
		
		//for calling destroy method
		ticket.registerShutdownHook();
	}
}
