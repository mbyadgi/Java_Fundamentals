package com.pluralsight.javafundamentals.nestedtypedemo;

import java.util.Iterator;

public class FlightWithInnerClass implements Iterable<Passenger> {
	
	private Passenger[] crew;

	public Passenger[] getCrew() {
		return crew;
	}

	public void setCrew(Passenger[] crew) {
		this.crew = crew;
	}

	@Override
	public Iterator<Passenger> iterator() {
		return new FlightIterator();
	}
	
	private class FlightIterator implements Iterator<Passenger>{
		int index = 0;
		
		@Override
		public boolean hasNext() {
			return index < getCrew().length;
		}

		@Override
		public Passenger next() {
			Passenger passenger = getCrew()[index];
			index++;
			return passenger;
		}
	}
}
