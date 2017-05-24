package com.pluralsight.javafundamentals.abstraction;

public class AbstractionDemo {
	
	public static void main(String[] args) {
		Calculator[] calculators = new Calculator[4];
		calculators[0] = new Adder(25.0, 92.0);
		calculators[1] = new Subtractor(225.0, 17.0);
		calculators[2] = new Multiplier(11.0, 3.0);
		calculators[3] = new Divider(100.0, 50.0);
		
		for(Calculator calculator : calculators){
			calculator.calculate();
			System.out.println(calculator.getResult());
		}
	}

}
