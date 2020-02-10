package com.cts.training.interfaces;

public interface IMethodCheck {
	
	public default void fun() {
		System.out.println("Funof interface!");
	}
	
	public static void sfun() {
		System.out.println("Sfun of interface!");
	}
}
