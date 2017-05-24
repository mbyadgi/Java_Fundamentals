package com.pluralsight.javafundamentals.calcengine;

public class Subtractor extends Calculator{
	
	public Subtractor() {}
	
	public Subtractor(double leftVal, double rightVal){
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double val = getLeftVal() - getRightVal();
		setResult(val);
	}

}
