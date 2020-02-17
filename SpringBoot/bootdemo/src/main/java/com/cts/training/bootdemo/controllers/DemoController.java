package com.cts.training.bootdemo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> firstmethod(){
		
		ResponseEntity<String> response = new ResponseEntity<String>("This is hello controller-added-new",HttpStatus.OK);
		return response;
		
	}

}
