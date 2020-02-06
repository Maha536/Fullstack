package com.examples;

interface Samplei{
	int a=10;
	void fun();
	
}

class Derive implements Samplei{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("inside fun");
	}
	
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samplei s;
		s=new Derive();
		System.out.println(s.a);
		s.fun();
	}

}
