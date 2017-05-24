package com.pluralsight.javafundamentals.abstraction;

public class Divider extends Calculator{
	
	public Divider() {}
	
	public Divider(double leftVal, double rightVal){
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double val = getLeftVal() / getRightVal();
		setResult(val);
	}

}
