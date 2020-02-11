package com.cts.training.web.models;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import javax.validation.constraints.NotNull;

import com.cts.training.web.validators.IdPrefix;



public class Student {
	
	//decorate feild with annotation to validate
	@NotNull(message = "Name required..")
	private String uname;
	
	private String email;
	private String country;
	private String favoriteLanguage;
	private String[] os;
	
	@NotNull(message="Age required..")
	@Max(value= 100, message ="Must be less than 100")
	@Min(value= 1, message ="Must be grater than 1")
	private Integer age;
	
	@NotNull(message="ID required..")
	@IdPrefix(code="CTS", message="Invalid")
	private String uid;
	
	
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	//collection of country list
	LinkedHashMap<String,String> countries ;
	
	public Student(){
		this.countries = new LinkedHashMap<String,String>();
		this.countries.put("IND","India");
		this.countries.put("ENG","England");
		this.countries.put("BAN","Bangladesh");
		this.countries.put("PAK","Pakisthan");
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getEmail() {
		/*if(this.email == null)
			return "dummy@mail.com";*/
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
		if(this.email == null)
			this.email = "dummy@mail.com";
	}
}
