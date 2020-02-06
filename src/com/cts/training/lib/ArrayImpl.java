package com.cts.training.lib;

import java.util.Scanner;

public class ArrayImpl {
	
	public float averageOfMul5(int range) {
		int []arr =new int[range];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of Array:");
		for(byte i=0;i<range;i++)
			arr[i]=sc.nextInt();
		float avg=0;
		int sum=0,count=0;
		
		for(byte i=0;i<arr.length;i++)
		{
			if(arr[i]%5 == 0) {
				sum +=arr[i];
				count++;
			}
		}
		
		try {
		avg = sum/count;
		}
		finally{
			return avg;
		}
		
	}
	
	public int minValPosition(int range) {
		int []arr =new int[range];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of Array:");
		for(byte i=0;i<range;i++)
			arr[i]=sc.nextInt();
		int min=arr[0],pos=0;
		for(byte i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				pos=i;
			}
		}
		sc.close();
		return pos;
	}

}
