package com.codeD.springCore.AutoWired.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("classRoom")
public class ClassRoom {
	
	@Autowired
	@Qualifier("student1")
	private Student student;

	@Override
	public String toString() {
		return "ClassRoom [student=" + student + "]";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
