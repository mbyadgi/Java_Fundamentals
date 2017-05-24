package com.pluralsight.javafundamentals;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {
	
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		int total = 0;
		try{
			bufferedReader = new BufferedReader(new FileReader("D:\\Coding Stuff\\workspace\\HelloWorld"
					+ "\\src\\com\\pluralsight\\javafundamentals\\Numbers.txt"));
			String line = null;
			while((line = bufferedReader.readLine()) != null){
				total += Integer.valueOf(line);
			}
			System.out.println(total);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try{
				if(bufferedReader != null)
					bufferedReader.close();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
