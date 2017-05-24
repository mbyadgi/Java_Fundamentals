package com.pluralsight.javafundamentals;

public class StringEquality {
	
	public static void main(String[] args) {
		String s1 = "I ";
		s1	+= "love java";
		String s2 = "I love ";
		s2 += "java";
		
		System.out.println(s1 == s2); // false - since two different objects were created
		System.out.println(s1.equals(s2)); // true - since a character by character comparison is done
		
		String s3 = s1.intern(); // returns a canonical representation of string object
		String s4 = s2.intern();
		
		System.out.println(s3==s4); // true - since both references point to same object
		
		String s5 = "Hello Jim";
		String s6 = "Hello Jim";
		
		System.out.println(s5==s6);
	}

}
