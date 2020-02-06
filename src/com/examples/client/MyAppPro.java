package com.examples.client;

import java.util.Scanner;

import com.examples.*;

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of shapes to draw");
		byte n = sc.nextByte();
		Shape sarr[] = new Shape[n];
		for (int i=0;i<n;i++) {
			System.out.println("Enter type of shape required");
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Square");
			System.out.println("4.Polygon");
			System.out.println("Your choice:");
			byte choice = sc.nextByte();
			switch(choice) {
			case 1 : sarr[i] = new Circle();
					 break;
			case 2 : sarr[i] = new Rectangle();
					 break;
			case 3 : sarr[i] = new Square();
			 		 break;
			case 4 : sarr[i] = new Polygon();
			 		 break;
			default : System.out.println("Bad choice");
			          sarr[i]=null;
			}
		}
		for(byte i=0;i<n;i++) {
			sarr[i].draw();
		}
	}

}
