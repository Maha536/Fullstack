package com.cts.training.interfaces;

class Sample{
	void sendMessage(Greetings greetings,String message) {
		greetings.sendGreetings(message);
	}
}
public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Sample obj = new Sample();
				// obj.sendMessage("Hello All");
				Greetings email = new EmailGreetings();
				obj.sendMessage(email, "Hello All"); // passing functionality as object
				
				Greetings sms = new SmsGreetings();
				obj.sendMessage(sms, "Hello All"); // passing functionality as object
				
				obj.sendMessage(new Greetings() {

					
					@Override
					public void sendGreetings(String message) {
						// TODO Auto-generated method stub
						System.out.println("Greetings sent on TWITTER : " + message);
					}
					
				}, "Hello All");
				
				/*Greetings var = public void sendGreeting(String message) {
									// TODO Auto-generated method stub
									System.out.println("Greetings sent on TWITTER : " + message);
								};*/
				// Greetings facebook = (message)->System.out.println("Greetings sent on FACEBOOK : " + message);
				// obj.sendMessage(facebook, "Hello All");
				obj.sendMessage(message->System.out.println("Greetings sent on FACEBOOK : " + message), "Hello All");
	}
}
