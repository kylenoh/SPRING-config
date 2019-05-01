package com.kyle.sts;

public class MyCalculator {
	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}

	public MyCalculator(Calculator calculator, int firstNum, int secondNum) {
		super();
		this.calculator = calculator;
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}
	public void div() {
		calculator.division(firstNum, secondNum);
	}
	
}
