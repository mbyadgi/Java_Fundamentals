package com.pluralsight.javafundamentals;

public class ParameterImmutability {

	public static void main(String[] args) {
		int val1 = 10;
		int val2 = 20;
		System.out.println("val1 = "+val1);
		System.out.println("val2 = "+val2);
		swap(val1, val2);
		System.out.println("val1 = "+val1);
		System.out.println("val2 = "+val2);
		
		Flight f1 = new Flight();
		f1.setFlightNumber(10);
		Flight f2 = new Flight();
		f2.setFlightNumber(20);
		System.out.println("f1 flight number = "+f1.getFlightNumber());
		System.out.println("f2 flight number = "+f2.getFlightNumber());
		swapFlights(f1, f2);
		System.out.println("f1 flight number = "+f1.getFlightNumber());
		System.out.println("f2 flight number = "+f2.getFlightNumber());
		swapFlightNumbers(f1, f2);
		System.out.println("f1 flight number = "+f1.getFlightNumber());
		System.out.println("f2 flight number = "+f2.getFlightNumber());
	}
	
	public static void swap(int i, int j){
		int k = i;
		i = j;
		j = k;
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
	
	public static void swapFlights(Flight i, Flight j){
		Flight k = i;
		i = j;
		j = k;
		System.out.println("i flight number = "+i.getFlightNumber());
		System.out.println("j flight number = "+j.getFlightNumber());
	}
	
	public static void swapFlightNumbers(Flight i, Flight j){
		int k = i.getFlightNumber();
		i.setFlightNumber(j.getFlightNumber());
		j.setFlightNumber(k);
		System.out.println("i flight number = "+i.getFlightNumber());
		System.out.println("j flight number = "+j.getFlightNumber());
	}
}

class Flight{
	int flightNumber;
	
	public int getFlightNumber(){
		return flightNumber;
	}
	
	public void setFlightNumber(int flightNumber){
		this.flightNumber = flightNumber;
	}
}
