package com.examples;

class Sample{
	static int a ;
	int b=80;
	Sample(){
		 System.out.println("Inside Constructor");
	 }
	{
		System.out.println("Inside init block !");
		//System.out.println(a);
		//System.out.println(b);
	}
	static{
		System.out.println("inside Static block");
	}
	
	
}

public class Myapp extends Sample{
	
	
	public static void main(String[] args) throws Exception {
		/*System.out.println("Myapp Started");
		Sample sap ;
		System.out.println("after reference");
		sap = new Sample();
		System.out.println("after object");
		Sample s2 = new Sample();
		*/
		//Class.forName("com.examples.Sample");
		//Sample.a=10;
		Sample s2 = new Sample();
		
		
	}

}
