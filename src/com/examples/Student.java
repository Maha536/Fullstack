package com.examples;

import java.io.Serializable;

public class Student implements Serializable{

	private final static long serialVersionUID = 1L;
	private int id;
	private int age;
	private String name;
	private String email;
	private int grade;
	private double gpa;
	private String intrests;
	
	
	public String getIntrests() {
		return intrests;
	}


	public void setIntrests(String intrests) {
		this.intrests = intrests;
	}


	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", email=" + email + ", grade=" + grade + ", gpa=" + gpa + ", intrests=" + intrests + "]";
	}


	public Student() {
		
	}
	
	
	public Student(int id, String name, String email, int grade, double gpa, String intrests) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.grade = grade;
		this.gpa = gpa;
		this.intrests = intrests;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	

}
