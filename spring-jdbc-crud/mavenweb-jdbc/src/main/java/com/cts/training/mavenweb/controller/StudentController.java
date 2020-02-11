package com.cts.training.mavenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.mavenweb.dao.IStudentDao;
import com.cts.training.mavenweb.entity.Student;
import com.cts.trating.web.services.IStudentSer;
import com.cts.trating.web.services.IStudentSerImplementation;

@Controller
@RequestMapping("/student")
public class StudentController {

	// dependency
	@Autowired
	private IStudentSer studentser;
	
	@RequestMapping("/all")
	public String showAll(Model model) {
		// get data from DAO layer
		List<Student> students = this.studentser.findAllStudent();
		
		// add to model object
		model.addAttribute("students", students);
		
		// return the view page
		return "student-list";
	}
	
	@RequestMapping("/add")
	public String addStudent(Model model) {
		Student student = new Student(); 
		
		return "add-student";
	}
	@RequestMapping("/save")
	public String confirmation(@ModelAttribute Student s) {
		
		this.studentser.addStudent(s);
		return "redirect:/student/all";
	}
	
	@RequestMapping("/update")
	public String Updation(@RequestParam Integer id,Model model) {
		
		 
		 Student s = this.studentser.findStudentById(id);
		 System.out.println("data received");
		 model.addAttribute("student",s);
		
		return "student-update";
	}
	
	@RequestMapping("/confirm")
	public String confirmationupadte(@ModelAttribute Student s) {
		
		this.studentser.updateStudent(s);
		return "redirect:/student/all";
	}
	
	//path variable
	@RequestMapping("/delete/{sid}")
	public String Deletion(@PathVariable Integer sid) {
		
		this.studentser.deleteStudent(sid);
		 
		return "redirect:/student/all";
	}
	
	
	
}
