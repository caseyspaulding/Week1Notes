package com.skillstorm.general;

import java.util.Scanner;

public class InterestCalculator {
	
	public static void main(String[] args) {
		// Scanner to read user input
		Scanner in = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("        -   Casey Spaulding's Simple Interest Calculator  -             ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Welcome to the Simple Interest Calculator! ");
		System.out.println("");
		
		System.out.println("Please enter your principle:");
		
		System.out.println("");
		double principle = in.nextDouble();
		
		System.out.println("Thank you. Next, please enter your rate as a percentage:");
		
		System.out.println("");
		double rate = in.nextDouble();
		
		System.out.println("Next, please enter the amount of years:");
		double years = in.nextDouble();
		
		// Calculate simple interest 
		double simpleInterest = (principle * rate * years) / 100;
		

		// Result
		System.out.println("Compound Interest Amount = $" + simpleInterest);
		
		
		//Part 2
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("        -   LEVEL 2! Casey Spaulding's Compound Interest Calculator  -             ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Welcome to the Compound Interest Calculator! ");
		System.out.println("");
		
		System.out.println("Please enter your principle:");
		
		System.out.println("");
		double principle2 = in.nextDouble();
		
		System.out.println("Thank you. Next, please enter your rate as a percentage:");
		
		System.out.println("");
		double rate2 = in.nextDouble();
		
		System.out.println("Next, please enter the amount of years:");
		double years2 = in.nextDouble();
		
		System.out.println("Enter the time interest is compounded per year: ");
		double n = in.nextDouble();
		
		// Calculate compound interest 
	
		
		double amount = principle2 * Math.pow(1 + (rate / n),  n * years);
		double compoundInterest = amount - principle2;
		
		// Result
		System.out.println("Compound Interest after " + years + " years is: = " + compoundInterest);
		
		System.out.println("");
		System.out.println("Thank you for trying my program! Have a great day!");
		
	}

}
