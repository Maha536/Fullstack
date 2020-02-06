package com.examples;

import java.util.Scanner;

public class NumberToWords {

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
			System.out.println(div);
			/*switch(div) {
				case 0:System.out.print("zero");
						break;
				case 1:System.out.print("one");
						break;
				case 2:System.out.print("two");
						break;
				case 3:System.out.print("three");
						break;
				case 4:System.out.print("four");
						break;
				case 5:System.out.print("five");
						break;
				case 6:System.out.print("six");
						break;
				case 7:System.out.print("seven");
						break;
				case 8:System.out.print("eight");
						break;
				default:System.out.print("nine");
						break;
			}
			System.out.print(" ");*/
			i=i/10;
			count--;
		}
	}

}
