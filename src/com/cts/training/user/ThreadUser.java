package com.cts.training.user;

import com.cts.training.threads.Mthread;

public class ThreadUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mthread t = new Mthread();
		t.start();
		for (int i=0;i<100;i++) {
			System.out.println("Main");
		}
		try {
		t.join();
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Main Terminated");
	}

}
