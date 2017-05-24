package com.pluralsight.javafundamentals.staticdemo;

public class StaticDemo {

	public static void main(String[] args) {
		CrewMember crewMember1 = CrewManager.findAvailable(FlightCrewJob.Pilot);
		System.out.println(crewMember1.getName());
		
	}
}
