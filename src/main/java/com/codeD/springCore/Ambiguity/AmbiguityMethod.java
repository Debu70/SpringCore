package com.codeD.springCore.Ambiguity;

public class AmbiguityMethod {
	
	private int firstNumber;
	private int secondNumber;
	
	
	
	public AmbiguityMethod(int firstNumber, int secondNumber) {
		super();
		System.out.println("Int-Param");
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	
	public AmbiguityMethod(double firstNumber, double secondNumber) {
		super();
		System.out.println("Double-Param");
		this.firstNumber = (int) firstNumber;
		this.secondNumber = (int) secondNumber;
	}
	
	public AmbiguityMethod(String firstNumber, String secondNumber) {
		super();
		System.out.println("String-Param");
		this.firstNumber = Integer.parseInt(firstNumber);
		this.secondNumber = Integer.parseInt(secondNumber);
	}
	
	
	
	public void doSum() {
		System.out.println("sum "+(this.firstNumber+this.secondNumber));
	}
	
	
}
