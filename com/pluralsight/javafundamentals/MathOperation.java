package com.pluralsight.javafundamentals;

public class MathOperation {
	
	public static void main(String[] args){
		MathOperation mathOperation = new MathOperation();
		//mathOperation.postfixPrefixOperationDemo();
		//mathOperation.operatorPrecedenceDemmo();	
		mathOperation.typeCoversionDemo();
	}
	
	public void postfixPrefixOperationDemo(){
		int myVal = 5;
		
		/**
		 * Prefix operation -- applies operation before returning value
		 */
		System.out.println(++myVal); // myval = 6
		System.out.println(myVal); // 6
		
		/**
		 * Postfix operation -- applies operation after returning value
		 */
		System.out.println(myVal++); // myval = 6
		System.out.println(myVal); // 7
	}
	
	public void operatorPrecedenceDemmo(){
		int valA = 21, valB = 6, valC = 3, valD = 1;
		int result1 = valA - valB / valC;
		int result2 = (valA - valB) / valC;
		System.out.println(result1);
		System.out.println(result2);
		
		int result3 = valA / valC * valD + valB;
		int result4 = valA / (valC * (valD + valB));
		System.out.println(result3);
		System.out.println(result4);
	}
	
	public void typeCoversionDemo(){
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		
		/**
		 * Widening conversion / Implicit type conversion
		 */
		short result1 = byteVal;
		
		/**
		 * Narrow conversion / Explicit type conversion -- requires casting
		 */
		short result2 = (short) longVal;
		
		/**
		 * Implicit conversion in mixed types -- conversion to largest type
		 */
		double result3 = longVal - doubleVal;
		
		/**
		 * Explicit conversion in mixed types
		 */
		long result4 = (long) (shortVal - longVal + floatVal + doubleVal);
		// OR
		long result5 = shortVal - longVal + (long)floatVal + (long)doubleVal;
		
	}

}
