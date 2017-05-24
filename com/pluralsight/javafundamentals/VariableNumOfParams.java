package com.pluralsight.javafundamentals;

public class VariableNumOfParams {

	public static void main(String[] args) {
		VariableNumOfParams params = new VariableNumOfParams();
		Passenger john = new Passenger("John");
		Passenger jack = new Passenger("Jack");
		params.addPassengers(new Passenger[]{john, jack});
		// OR
		Passenger fred = new Passenger("Fred");
		Passenger sarah = new Passenger("Sarah");
		Passenger susie = new Passenger("Susie");
		params.addPassengers(fred, sarah, susie);
	}

	public void addPassengers(Passenger... list){
		for(Passenger passenger : list){
			System.out.println(passenger.name);
		}
	}

}

class Passenger{
	String name;
	public Passenger(){}
	public Passenger(String name){
		this.name = name;
	}
}
