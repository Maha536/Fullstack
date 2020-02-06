package com.cts.training.user;

import java.util.Scanner;

import com.cts.training.lib.ArrayImpl;

public class ArrayUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range;
		System.out.println("Enter the range of Array:");
		range=sc.nextInt();
		System.out.println("1.Average of multiples of 5\n2.Position of minimum value\nPlease choose the operation to be performed:");
		byte choice = sc.nextByte();
		ArrayImpl ai=new ArrayImpl();
		if(choice==1 || choice==2) {
			switch(choice) {
				case 1: System.out.println("Average of multiples of 5 is:"+ai.averageOfMul5(range));
					break;
				case 2: System.out.println("Position of minimum value is:"+ai.minValPosition(range));
			}
		}
		else {
			System.out.println("Invalid Operation selected");
		}
		sc.close();
	}

}
