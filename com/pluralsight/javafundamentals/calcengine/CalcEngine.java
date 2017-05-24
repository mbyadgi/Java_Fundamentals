package com.pluralsight.javafundamentals.calcengine;

public class CalcEngine {
	
	public static void main(String[] args) {
		String[] statements = {
				"add 25.0 92.0",
				"power 5.0 2.0"
		};
		
		DynamicHelper dynamicHelper = new DynamicHelper(new MathProcessing[]{
				new Adder(),
				new Power()
		});
		
		for(String statement : statements){
			System.out.println(dynamicHelper.process(statement));
		}
	}
	
	static void useCalculateHelper(){

		String[] statements = {
				"add 1.0",
				"add xx 25.0",
				"addx 1.0 2.0",
				"add 25.0 92.0",
				"substract 225.0 117.0",
				"multiply 11.0 3.0",
				"divide 100.0 50.0"
		};
		
		CalculateHelper calculateHelper = new CalculateHelper();
		
		for(String statement : statements){
			try {
				calculateHelper.process(statement);
				System.out.println(calculateHelper);
			} catch (InvalidStatementException e) {
				System.out.println(e.getMessage());
				if(e.getCause() != null)
					System.out.println("   Original exception :" + e.getCause().getMessage());
			}
		}
	}

}
