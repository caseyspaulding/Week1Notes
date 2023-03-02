package com.skillstorm.general;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[]args) {
		

		
		byte age = 21;
		boolean accessGranted = true;
		short shoeSize = 10;
		long accountNumber = 1239988888L;
		int zipCode = 33896;
		float gpa = 3.65f;
		double milligrams = .56355;
		char letterGrade = 'A';
		String firstName = "Casey";
		String lastName = "Spaulding";
		
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is your name? ");
	    
	    String name = in.nextLine();
	    
	    System.out.println("Hello " + name + ". What data type is age? ");
	    
	    String ageDataType = in.nextLine();
	    
	    System.out.println(ageDataType + " interesting... I made age a byte datatype. " );
	    
	    System.out.println("Ok " + name + ". What data type is accessGranted?");
	    
	    String accessDataType = in.nextLine();
	    
	    System.out.println(accessDataType + " interesting... I made it a boolean data type. " );
	    
	    System.out.println("Your pretty good. " + name + ". What data type is did I make shoeSize?");
	    
	    String shoeDataType = in.nextLine();
	    
	    System.out.println(shoeDataType + " interesting... I made it a short data type. " );
	    
	    System.out.println( name + ". What data type is did I make accountNumber?");
	    
	    String accountDataType = in.nextLine();
	    
	    System.out.println(accountDataType + " Not bad... I made it a long data type because thats alot of numbers." );
	    
	    System.out.println( name + ". What data type did I make zipcode?");
	    
	    String zipcodeDataType = in.nextLine();
	    
	    System.out.println(zipcodeDataType + " Not bad... I made it a int data type.." );
	    
	    System.out.println( name + ". What data type did I make gpa?");
	    
	    String gpaDataType = in.nextLine();
	    
	    System.out.println(gpaDataType + " Not bad... I made it a float data type.." );
	    
	    System.out.println( name + ". What data type did I make milligrams?");
	    
	    String milligramsDataType = in.nextLine();
	    
	    System.out.println(milligramsDataType + " Not bad... I made it a double data type.."
	    		+ "\n Well.. you have reached the end of this program. \n Live long and prosper. \n Also, May the force be with you." );
	    
	    
	  
	    
	    in.close();
	    
				
		
				
		
		
	}
}
