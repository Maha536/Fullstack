package com.cts.training.user;

import java.util.Scanner;

import com.cts.training.lib.Calculate;

public class MyApplicationPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Reverse_number\n2.NumberToWord\n3.NumberExpansion\nChoose the Format you want to display :");
		byte choice = sc.nextByte();
		if(choice==1 || choice==2 || choice==3 ) {
			System.out.println("Enter the number :");
			num = sc.nextInt();
			Calculate cal;
			cal = new Calculate();
			switch(choice) {
				case 1 : System.out.println("The reverse number is:"+cal.reverse(num));
						break;
				case 2 : cal.numberToWord(num);
						break;
				case 3 : cal.numberExpansion(num);
						break;
			}
		}
		else
			System.out.println("Bad choice");
		sc.close();


	}

}
