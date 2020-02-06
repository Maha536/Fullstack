package com.examples.client;

import java.util.Scanner;

import com.examples.*;

public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter type of shape required");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Square");
		System.out.println("4.Polygon");
		System.out.println("Your choice:");
		Shape sp=null;
		int choice = sc.nextInt();
		if(choice == 1)
			sp=new Circle();
		else
			if(choice == 2)
				sp=new Rectangle();
			else {
				System.out.println("Bad choice");
				System.exit(1);
			}
		sp.draw();
		sc.close();
	}

}
