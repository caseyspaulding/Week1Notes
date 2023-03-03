package com.skillstorm.general;

import java.util.Scanner;

public class PassFailCalc {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        
        String name = in.nextLine();
	    
	    System.out.println("Hello " + name + ". Please enter your grade percentage to find out if you passed." );
	    double grade = in.nextDouble();
	    
	    if(grade >= 90) {
	    	System.out.println("Congratulations you PASSED with an A.");
	    }else if(grade >= 80) {
	    	System.out.println("Congratulations you PASSED with a B.");
	    }else if(grade >= 70) {
	    	System.out.println("Congratulations you PASSED with a C.");
	    }
	    	else {
	    		System.out.println("Sorry," + name + " you FAILED. Game Over!");
	    		
	    	}
	    }
	}


