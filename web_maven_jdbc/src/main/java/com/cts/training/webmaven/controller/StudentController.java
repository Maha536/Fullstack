package com.cts.training.webmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.webmaven.dao.DaoInterface;
import com.cts.training.webmaven.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private DaoInterface dao;
	
	
	@RequestMapping("/all")
	public String showAll(Model model){
		List<Student> students = this.dao.findAll();
		model.addAttribute("students",students);
		
		return "show-all";
		
	}

}
