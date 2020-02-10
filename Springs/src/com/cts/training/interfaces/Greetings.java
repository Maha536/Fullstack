package com.cts.training.interfaces;

public interface Greetings {
	
	public default void sendMessage() {
		
	}

	public void sendGreetings(String message);
	
}
