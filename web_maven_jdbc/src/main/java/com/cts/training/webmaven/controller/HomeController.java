package com.cts.training.webmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "home-page";
	}
	

	@RequestMapping("/index")
	public String homealter() {
		
		return "home-page";
	}

}
