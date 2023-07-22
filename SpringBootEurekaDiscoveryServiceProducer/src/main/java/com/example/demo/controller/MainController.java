package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping(value = "/get")
	public String GetData() {
		
		return "Data From MainController";
	}
	
	@GetMapping("/get/{id}")
    public String getData(@PathVariable int id) {
		System.out.println(id);
		return "Got it id";
	}
}
