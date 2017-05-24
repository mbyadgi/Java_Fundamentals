package com.pluralsight.javafundamentals;

public class MemberHidingAndOverriding {

	public static void main(String[] args) {
		Plane p = new Plane();
		CargoPlane cp = new CargoPlane();
		Plane pc = new CargoPlane();
		
		System.out.println(p.seats); // prints 150
		System.out.println(cp.seats); // prints 12
		System.out.println(pc.seats); // prints 150
		/**
		 * Similar to above line the below line is not allowed
		 * since pc is reference variable of Plane only its method and variables are accessible
		 */
		/**
		 * When we have a reference of a given type 
		 * we can only access the capabilities that are visible to the reference
		 */
		//pc.add1Cargo();
		/**
		 * One way to resolve above problem is as shown below
		 */
		if(pc instanceof CargoPlane){ // to be extra sure
			CargoPlane cp1 = (CargoPlane) pc;
			cp1.add1Cargo();
		}
		
		p.add1Passenger(); // prints 150
		cp.add1Passenger(); // prints 150
		pc.add1Passenger(); // prints 150
		
		/**
		 * above problem can be solved by Method overloading
		 */
		System.out.println(p.getSeats()); // prints 150
		System.out.println(cp.getSeats()); // prints 12
		// Method overloading assures that appropriate method is called 
		// based on the type of object created and not on the type of reference
		System.out.println(pc.getSeats()); // prints 12
	}
}

class Plane{
	int seats = 150;
	int passengers = 0;
	public void add1Passenger(){
		System.out.println("seats = "+seats);
		System.out.println("getSeats = "+getSeats());
		if(passengers < seats){
			passengers += 1;
		}else{
			System.out.println("Too many passengers");
		}
	}
	public int getSeats(){
		return 150;
	}
}

class CargoPlane extends Plane{
	int seats = 12;
	int cargo = 0;
	public void add1Cargo(){
		cargo += 1;
	}
	public int getSeats(){
		return 12;
	}
}