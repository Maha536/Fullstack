package com.cts.training.matrices;

import java.util.Scanner;

public class Matrix {
	public int arr[][];
	public byte rows,cols;
	
	public void initMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows :");
		rows = sc.nextByte();
		System.out.println("Enter no of columns:");
		cols = sc.nextByte();
		arr = new int[rows][cols];
		for(byte i=0;i<rows;i++) {
			System.out.println("Enter elements for row-"+(i+1)+":");
			for(byte j=0;j<cols;j++) {
				System.out.println("Enter element for column-"+(j+1)+":");
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	public void display() {
		
		for(byte i=0;i<this.rows;i++) {
			for(byte j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();	
		}
		
	}
	
	public boolean isUnit() {
		for(byte i=0;i<rows;i++) {
			for(byte j=0;j<cols;j++) {
				if(arr[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void rowAddition() {
		int sum;
		for(byte i=0;i<rows;i++) {
			sum=0;
			for(byte j=0;j<cols;j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of row-"+(i+1)+" is: "+sum);
		}
	}
	

}
