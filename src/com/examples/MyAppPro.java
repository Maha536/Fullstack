package com.examples;

abstract class BasePro {
	int a;
	final int b=10;
	abstract void fun();
	abstract void fun1();
	final void trial() {
	}
	
}

class Derived1 extends BasePro{

	@Override
	void fun() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method 1 invoked");
	}

	@Override
	void fun1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method 2 invoked");
		System.out.println(b);
	}
	
	
}

/*class Derived2 extends Base{
	
	
}*/

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePro b= new Derived1();
		b.fun();
		b.fun1();
		Derived1 d=new Derived1();
		d.fun();
		d.fun1();
	}

}
