package com.pluralsight.javafundamentals.staticdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CrewManager {

	private static CrewMember[] pool;
	
	static{
		pool = new CrewMember[10];
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("D:\\Coding Stuff\\workspace\\HelloWorld\\src"
					+ "\\com\\pluralsight\\javafundamentals\\staticdemo\\CrewMembers.txt"));
			String line = null;
			int index = 0;
			while((line = reader.readLine()) != null){
				String[] parts = line.split(",");
				pool[index] = new CrewMember(FlightCrewJob.valueOf(parts[0]));
				pool[index].setName(parts[1]);
				index++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(reader != null){
					reader.close();
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static CrewMember findAvailable(FlightCrewJob job){
		CrewMember crewMember = null;
		for(int i=0; i < pool.length; i++){
			if(pool[i].getJob().equals(job)){
				crewMember = pool[i];
				pool[i] = null;
				break;
			}
		}
		return crewMember;
	}
}
