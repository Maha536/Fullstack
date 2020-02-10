package com.cts.training.interfaces;

public class SmsGreetings implements Greetings{

	
	@Override
	public void sendGreetings(String message) {
		// TODO Auto-generated method stub
		System.out.println("Greetings sent on SMS : " + message);
	}

}
