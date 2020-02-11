package com.cts.training.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// Action Methods : containing the logic to process the request
		/*
		 * 1. Access modifier : public 
		 * 2. Return type : String
		 * 3. Name : anything
		 * 4. Parameter : depends on req
		 * 5. Url MApping
		 */
		
		
		@RequestMapping("/")
		public String home() {
			return "home-page";
			
		}
		
		
		@RequestMapping("/index")
		public String homealter() {
			return "home-page";
		}
	
	
	
	

}
