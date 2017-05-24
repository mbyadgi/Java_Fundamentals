package com.pluralsight.javafundamentals.nestedtypedemo;

public class NestedTypeDemo {

	public static void main(String[] args) {
		Passenger john = new Passenger();
		john.setName("John");
		john.getRewardsProgram().setMemberLevel(3);
		
		Passenger.RewardsProgram rewardsProgram = new Passenger.RewardsProgram();
		rewardsProgram.setMemberLevel(3);
		
		if(john.getRewardsProgram().getMemberLevel() == rewardsProgram.getMemberLevel()){
			System.out.println("John is a Platium Member");
		}
		
		FlightWithInnerClass class1 = new FlightWithInnerClass();
		class1.setCrew(new Passenger[2]);
		Passenger patty = new Passenger("Patty");
		Passenger alex = new Passenger("Alex");
		class1.getCrew()[0] = patty;
		class1.getCrew()[1] = alex;
		for(Passenger passenger : class1.getCrew()){
			System.out.println(passenger.getName());
		}
		
		FlightWithAnonymousClass class2 = new FlightWithAnonymousClass();
		class2.setCrew(new Passenger[2]);
		Passenger paul = new Passenger("Paul");
		Passenger fred = new Passenger("Fred");
		class2.getCrew()[0] = paul;
		class2.getCrew()[1] = fred;
		for(Passenger passenger : class2.getCrew()){
			System.out.println(passenger.getName());
		}
	}
}
