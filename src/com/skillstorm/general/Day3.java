package com.skillstorm.general;

public class Day3 {
	
	public static void main(String[] args) {
		
		int int1 = 7, int2 = 6;
		long long1 = 71;
		short short1 = 5;
		byte byte1 = 2;
		float float1 = 3.1416F;
		double double1 = 45.352;
		
		System.out.println(int1 + int2);
		
		System.out.println(long1 + int2);
		
		System.out.println(short1 + int1 + int2 + long1);
		
		System.out.println(int1 - int2);
		
		System.out.println(long1 - int2);
		
		System.out.println(int1 * int2);
		
		System.out.println(int1 / int2);
		
		System.out.println(float1 / double1);
		
		// explicit casting is done with ()
		int intresult = 0 ;
				
		intresult = int1 + int2 - short1 * int1 + short1 / byte1;
		
		System.out.println(intresult);
		
		double doubleResult = 0.0;
		
		doubleResult = int1 - int2 * short1 + float1 / double1 * byte1;
		
		
		
		
	}

}
