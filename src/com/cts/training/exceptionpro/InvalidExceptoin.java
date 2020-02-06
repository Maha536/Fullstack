package com.cts.training.exceptionpro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidExceptoin extends Exception {
	public static void ageInput() throws InvalidAgeException{
		int age;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee age:");
			age = sc.nextInt();
			if(age <20 || age>60) {
				throw new InvalidAgeException("Age range is 20-60");
				//System.out.println("");
			}
			System.out.println("Age entered successfully");
		}
		
		catch(InputMismatchException e) {
			System.out.println(e+"\nInvalid format");
		}
		
		//catch(InvalidAgeException ae) {
		//	System.out.println("Invalid Age");
		//}
	}
	
	public static void main(String[] args) throws Exception {
		ageInput();
	}
}
