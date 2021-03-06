package com.cts.training.web.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String profile() {
		return "student-profile";
	}
	
	// query String
	// http://localhost:9090/Spring-mvc/student/save?uname=First&email=first@mail.com
	// Traditional Servlet way
	/*@RequestMapping("/save") // fallback method for bad url
	public String saveData(HttpServletRequest request) {
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		System.out.println("\nName : " + uname);
		System.out.println("Email : " + email);
		return "student-confirm";
	}*/
	
	// Spring way
	/*@RequestMapping("/save") // fallback method for bad url
	// public String saveData(@RequestParam String uname, @RequestParam String email) {
	public String saveData(@RequestParam("uname") String userName, @RequestParam(value = "email", required = false, defaultValue = "dummy@mail.com") String userEmail) {
		// System.out.println("\nName : " + uname);
		// System.out.println("Email : " + email);
		
		System.out.println("\nName : " + userName);
		System.out.println("Email : " + userEmail.toUpperCase());
		return "student-confirm";
	}*/
	
	// Spring way (using model class)
	
	@RequestMapping("/savestudent") 
	public String saveData(Student student,Model model) {
		System.out.println("\nName : " + student.getUname());
		System.out.println("Email : " + student.getEmail());
		
		//process the data
		student.setUname(student.getUname().toUpperCase());
		student.setEmail(student.getEmail().toUpperCase());
		
		model.addAttribute("studentkey",student); // will be shared with model 
		
		return "student-confirm";
	}
	
	
	
	
	// mapping action method with parent url
	@RequestMapping() // default method for parent url
	public String defaultMethod() {
		return "student-home";
	}
	
	// Fallback url mapping (for bad urls)
	@RequestMapping("*") 
	public String fallbackMethod() {
		return "student-error";
	}
	
	
	
}
