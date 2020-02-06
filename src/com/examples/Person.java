package com.examples;

public class Person {
	String name;
	int age = 25;
	 
	public Person (String name) {
		this(); //
		setName(name);
	}
	public Person (String name, int age) { 
		Person(name);
		setAge(age);
	}
	//setter and getter methods go here
	public String show () { return name + " " + age;
	}
	public static void main (String[] args) { 
		Person pl = new Person ("Jesse"); 
		Person p2 = new Person ("Walter", 52);
	
	System.out.println (pl.show());
	System.out.println (p2.show());
	}

}
