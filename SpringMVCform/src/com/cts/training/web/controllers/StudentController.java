package com.cts.training.web.controllers;




import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.web.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	
	@RequestMapping("/profile")
	public String profile(Model  model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "student-profile";
	}
	
	
	@RequestMapping("/savestudent") 
	public String saveData(@Valid @ModelAttribute Student student,BindingResult result) {
		if(result.hasErrors()){
			return "student-profile";
		}
		
		System.out.println(result.hasErrors());
		
		System.out.println("\nName : " + student.getUname());
		System.out.println("Email : " + student.getEmail());
		//process the data
		//student.setUname(student.getUname().toUpperCase());
		//student.setEmail(student.getEmail().toUpperCase());
		// will be shared with model  : @ModelAttribute
		
		return "student-confirm";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping() 
	public String defaultMethod() {
		return "student-home";
	}
	
	
	@RequestMapping("*") 
	public String fallbackMethod() {
		return "student-error";
	}
	
	
	
}
