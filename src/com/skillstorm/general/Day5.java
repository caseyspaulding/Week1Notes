package com.skillstorm.general;

import java.util.Scanner;

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
		
		// ! : not
		// && : and
		// || : or
		
		int value = 4;
		boolean expression = value == 5;
		
		if (value + 3 == 7 || value % 2 == 0) {
			
			System.out.println("It was 4, or even");
			
		}
		
		if (value % 2 != 0) {
			
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Whats the best Destiny class?: ");
		
		String guess = input.nextLine();
		
		if (guess.equalsIgnoreCase("Hunter")) {
			
			
		}
		
		
		
	
		int val = 30;
		
		if(val >= 20) {
			
		}
		
		
	}

}
