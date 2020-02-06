package com.examples;

import java.util.Scanner;

public class NumberExpansionForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,div=0,temp,i=1,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		number = sc.nextInt();
		sc.close();
		temp=number ;
		
		while(temp>10) {
			temp =temp/10;
			i *= 10;
			count++;
		}
	
		while(count >=0) {
			div=number/i;
			number = number%i;
			if(count >= 1)
				System.out.print(div+"*"+i+"+");
			else
				System.out.print(div);
			count--;
			i=i/10;
		}
	}

}
