package com.pluralsight.javafundamentals;

public class ConditionalLogic {

	public static void main(String[] args){
		ConditionalLogic conditionalLogic = new ConditionalLogic();
	}
	
	public void logicalVsConditionalLogicalDemo(){
		int students = 40;
		int rooms = 0;
		
		/**
		 * Logical operator, evaluates both left and right side expessions
		 * Hence fails in this case
		 */
		if(rooms > 0 & students/rooms > 30){
			System.out.println("Crowded");
		}
		
		/**
		 * Conditional Logical operator, evaluates right side only if necessary
		 * In below case since left side is false and '&' operation requires both side to be true
		 * this means this expression is anyhow going to fail and hence no need to evaluate left side
		 */
		if(rooms > 0 && students/rooms > 30){
			System.out.println("Crowded");
		}
	}
	
}
