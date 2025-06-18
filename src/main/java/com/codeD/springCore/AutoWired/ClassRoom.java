package com.codeD.springCore.AutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("classRoom")
public class ClassRoom {
	
	@Autowired
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
