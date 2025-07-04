package com.codeD.springCore.LifeCycle.byUsingInterface;

import java.awt.desktop.ScreenSleepEvent;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	
	
	private String empId ;
	private String empName;
	
	@Override
	public String toString() {
		return "Employee [id=" + empId + ", empName=" + empName + "]";
	}
	
	public String getempId() {
		return empId;
	}
	public void setempId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Method Initialize ...!");
		
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method invoke ...!");
		
	}

	
	
	
}
