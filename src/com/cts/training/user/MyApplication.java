package com.cts.training.user;

import java.util.Scanner;

import com.cts.training.lib.Pattern;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.pattern1 \n2.pattern2\nChoose the pattern you want to display :");
		byte choice = sc.nextByte();
		if(choice==1 || choice==2  ) {
			System.out.println("Enter the no of rows in pattern");
			rows = sc.nextInt();
			sc.close();
			Pattern p;
			p = new Pattern();
			switch(choice) {
				case 1 : p.pattern1(rows);
						break;
				case 2 : p.pattern2(rows);
						break;
			
			}
		}
		else
			System.out.println("Bad choice");
		sc.close();

}
}