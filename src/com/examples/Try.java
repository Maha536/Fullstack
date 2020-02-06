package com.examples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Try {
	public static void main(String[] args) {
		int numbers[];
		numbers = new int[2];
		numbers[0]=10;
		numbers[1]=20;
		numbers = new int[4];
		numbers[2]=30;
		numbers[3]=40;
		for(int count : numbers)
		System.out.println(count +"Found");
}
}
	


