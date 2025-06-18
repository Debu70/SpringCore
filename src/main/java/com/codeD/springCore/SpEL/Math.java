package com.codeD.springCore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mathCompo")
public class Math {
	
	@Value("10")
	private int firstNumber;
	
	@Value("20")
	private int secondNumber;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int sqrt;
	


	public int getSqrt() {
		return sqrt;
	}
	public void setSqrt(int sqrt) {
		this.sqrt = sqrt;
	}
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	@Override
	public String toString() {
		return "Math [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + ", sqrt=" + sqrt + "]";
	}
	
}
