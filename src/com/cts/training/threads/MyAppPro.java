package com.cts.training.threads;

class AnonymousThread{
	Thread t;
	AnonymousThread(){
		this.t=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}/*inner anonymous class*/});
	}
}

class Mthread2{
	
	class Mthread2pro extends Thread{
		public void run() {
			
		}
		
	}
	
}
class Mthread1 implements Runnable {
	Thread thread;
	Mthread1(){
		this.thread=new Thread(this);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mthread1 m = new Mthread1();
		m.thread.start();
		
		Mthread2 mpro = new Mthread2();
		Mthread2.Mthread2pro mpro1 =mpro.new Mthread2pro();

}
}