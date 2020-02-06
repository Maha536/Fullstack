package com.examples.client;

import com.examples.Computer;
import com.examples.Computer.CPU;

public class My {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer C1 = new Computer();
		CPU c1=C1.new CPU();
		c1.process();
		//System.out.println(c1.content);
		
	}

}
