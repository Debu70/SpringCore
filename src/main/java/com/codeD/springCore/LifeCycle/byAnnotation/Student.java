package com.codeD.springCore.LifeCycle.byAnnotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student {
	
	private int studentId;
	private String StudentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + "]";
	}
	
	@PostConstruct
	private void initialize() {
		System.out.println("init - Method");
	}
	@PreDestroy
	private void kiilerMethod() {
		System.out.println("Destroy - Method");
	}
}
