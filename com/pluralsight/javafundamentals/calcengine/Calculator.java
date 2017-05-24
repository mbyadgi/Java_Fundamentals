package com.pluralsight.javafundamentals.calcengine;

public abstract class Calculator {

	private double leftVal;
	private double rightVal;
	private double result;

	public Calculator() {
	}

	public Calculator(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	public abstract void calculate();

	public double getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}

	public double getRightVal() {
		return rightVal;
	}

	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
}
