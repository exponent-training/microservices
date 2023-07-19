package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping(value = "/getData")
	public String getData() {
		
		return "Qwerty Keybord";  
	}

}
