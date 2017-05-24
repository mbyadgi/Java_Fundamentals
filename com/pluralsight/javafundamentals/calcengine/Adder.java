package com.pluralsight.javafundamentals.calcengine;

public class Adder extends Calculator implements MathProcessing{
	
	public Adder() {}
	
	public Adder(double leftVal, double rightVal){
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double val = getLeftVal() + getRightVal();
		setResult(val);
	}

	@Override
	public String getKeyword() {
		return "add";
	}

	@Override
	public char getSymbol() {
		return '+';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		setLeftVal(leftVal);
		setRightVal(rightVal);
		calculate();
		return getResult();
	}

}
