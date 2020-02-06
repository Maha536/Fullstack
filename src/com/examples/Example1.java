package com.examples;
 class Base{
	 private int a=99;
	 public  int b=12;
	 public int k;
	 int fun() 
	 	{
		
		 System.out.println(a);
		 return a;
		 }
 }
 
 class Derived extends Base {
	public int n;
	private int m;
	public double b;
	
 }
 public class Example1{
	public static void main(String[] args) {
		Derived d;
		d= new Derived();
		d.b=10;
		d.k=10;
		
		int p=d.fun();
		System.out.println(p);
		
}
}