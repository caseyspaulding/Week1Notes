package com.skillstorm.general;

public class Day5 {
	
	public static void main(String[] args) {
		int num = 5; // same way that numbers can come from math expressions
		boolean bool = num == 5; // booleans can be boolean expressions
		
		System.out.println(bool);
		System.out.println(!bool); // prints the opposite
		
		System.out.println(num == 5); //equal
		System.out.println(num > 5); // greater than
		System.out.println(num < 5); // less than
		System.out.println(num >= 5); // greater than or equal to
		System.out.println(num <= 5); // less than or equal to
		System.out.println(num != 5); // not equal
		
		System.out.println(num > 5 || num == 5); 
		
		System.out.println(num > 4 || num < 1 || num == 7);
		
		System.out.println(num > 4 && num < 1 && num == 7);
		
		
		
	}

}
