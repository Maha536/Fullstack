package com.cts.training.threads;

class Box {
	private int count;
	boolean produced;
	Box(){
		this.count=0;
		this.produced=false;
	}
	synchronized void put() {
		if(this.produced) {
			try {
				wait(500);
			}
			catch(Exception e) {
				
			}
			
		}
		this.count++;
		System.out.println("Produced: "+this.count);
		this.produced = true;
		notify();
	}
	synchronized void get() {
		if(this.produced) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		this.count--;
		System.out.println("Remain after Consumed :"+this.count);
		notify();
	}
}

class Producer extends Thread{
	Box b;
	volatile boolean running = false;
	Producer(Box b){
		this.b=b;
		this.running=false;
	}
	
	void startThread() {
		this.running = true;
		this.start();
	}
	void terminateThread() {
		this.running=false;
	}
	public void run() {
		while(this.running) {
			//this.b.get();
			try {
				Thread.sleep(80);
			}
			catch(Exception e) {
				
			}
			this.b.put();
		}
	}
}

class Consumer extends Thread{
	Box b;
	volatile boolean running = false;
	Consumer(Box c){
		this.b=c;
		this.running=false;
	}
	
	void startThread() {
		this.running = true;
		this.start();
	}
	void terminateThread() {
		this.running=false;
	}
	public void run() {
		while(this.running) {
			this.b.get();
			try {
				Thread.sleep(80);
			}
			catch(Exception e) {
				
			}
			//this.b.put();
		}
	}
	
	
	
	
}

public class ThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		
		p.startThread();
		c.startThread();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}
		
		//terminating thread
		p.terminateThread();
		c.terminateThread();
		
	}

}
