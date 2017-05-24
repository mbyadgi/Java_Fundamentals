package com.pluralsight.javafundamentals.staticdemo;

public class CrewMember {

	private FlightCrewJob job;
	private String name;
	
	public CrewMember(FlightCrewJob job){
		this.setJob(job);
	}

	public FlightCrewJob getJob() {
		return job;
	}

	public void setJob(FlightCrewJob job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
