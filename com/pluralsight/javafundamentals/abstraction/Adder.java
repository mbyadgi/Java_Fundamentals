package com.pluralsight.javafundamentals.abstraction;

public class Adder extends Calculator{
	
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

}
