package com.skillstorm.general;

import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) {
		
	// primitive types
		
		int favoriteNumber; // 
		//  is a 32 bit whole number
		// whole number from -2 billion - +2 billion or - 2^31
		// initialized = when given a value
		
		
		favoriteNumber = 7;
		
		int twentyOne = 31; 
		
		System.out.println(twentyOne);
		
		// ctrl+space pulls up intellisense (auto-fill)
		
		// bit - the smallest unit of measurement in a computer
		
		// byte - 8 bit value, from -128 to 127
		
		//  short - 16 bit whole number
		// range from -2^15 to (2^15)-1
		short smallishNumber = 345;
		
		// long - 64 bit a whole number
		
		System.out.print("What is your name? ");
		
		// to print something we use System.out 
		// to read something we use System.in
		// we hand System.in to a Scanner
	    Scanner in = new Scanner(System.in);
	    
	    String input = in.nextLine();
	    
	    System.out.println("Hello, " + input);
	    
	    
		
	}

}
