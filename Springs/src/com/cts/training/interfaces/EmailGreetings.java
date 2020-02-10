package com.cts.training.interfaces;

public class EmailGreetings implements Greetings {
	
	public void sendGreetings(String s) {
		System.out.println("Email Greetings sent !!!"+ s);
	}
	
	
}
