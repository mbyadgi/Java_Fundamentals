package com.pluralsight.javafundamentals.calcengine;

public class Multiplier extends Calculator{
	
	public Multiplier() {}
	
	public Multiplier(double leftVal, double rightVal){
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double val = getLeftVal() * getRightVal();
		setResult(val);
	}

}
