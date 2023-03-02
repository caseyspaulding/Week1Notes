package com.skillstorm.general;

public class Day4 {
	
	public static void main(String[] args) {
		
		//PEMDAS
		// power - exponents
		// first parameter is the base number,
		// second parameter is the power
		// 2 ^ 3
		
		System.out.println(Math.pow(2, 3));
		
		double result, double1 = 7.7, double2 = 10.9, double3 = 3.2;
		int int1 = 7, int2 = 3, int3 = 4;
		
		result = Math.pow(int3, 3) + int2 * Math.pow(double2 / int2,  2) - int1 * double2;
		
		result = double1 - double3 * Math.pow(int1,  int3) / int2 + double3;
		
		System.out.println(result);
		
		System.out.println(Math.sqrt(4));
		
		String fullName = "Casey Spaulding";
		
		System.out.println(fullName.substring(1, 4));
		
		
		
	}

}
