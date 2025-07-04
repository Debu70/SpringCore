package com.codeD.springCore.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Setter-Based Injection");
        
      ApplicationContext studentContext = new ClassPathXmlApplicationContext("com/codeD/springProj/SetterInjection/config.xml");
      StudentDAO student1 = (StudentDAO)studentContext.getBean("Student1");
      System.out.println(student1);
      StudentDAO student2 = (StudentDAO)studentContext.getBean("Student2");
      System.out.println(student2);
     
        
    }
}
