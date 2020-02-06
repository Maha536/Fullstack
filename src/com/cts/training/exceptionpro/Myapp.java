package com.cts.training.exceptionpro;

public class Myapp {
	public static void fun() {
		System.out.println("Before");
		try{ 
			int k[]=new int[5];
			int a,b,c;
			a=10;
			b=0;
		
				c=a/b;
				
			//catch(Exception e) {
			//	
			//}
			k[20]=98;
			System.out.println("After");
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e) {
			System.out.println("Exception handled by General Handler");
		}
		System.out.println("All completed");
	}

	public static void main(String[] args) {
		fun();
	}
	
}
