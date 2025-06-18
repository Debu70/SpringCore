package com.codeD.springCore.StereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	@Value("Priyabrata")
	private String Name;
	@Value("101")
	private int rollNumber;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", rollNumber=" + rollNumber + "]";
	}
	
	
	
}
