package com.cts.training.user;

import java.util.Scanner;

import com.cts.training.matrices.Matrix;

public class MatrixUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix matrix=new Matrix();
		matrix.initMatrix();
		Scanner s = new Scanner(System.in);
		System.out.println("1.Display Matrix\n2.Check unit matrix or not\n3.find row additions\nPlease choose :");
		byte ch;
		ch= s.nextByte();
		if(ch == 1 || ch == 2 || ch == 3) {
			switch(ch) {
				case 1: matrix.display();
						break;
				case 2: boolean b=matrix.isUnit();
						System.out.println("Given matrix is  unit matrix. : "+b);
						break;
				case 3: matrix.rowAddition();
						break;
			}
		}
		else
			System.out.println("Choose a valid operation!!!");
		s.close();
	}

}
