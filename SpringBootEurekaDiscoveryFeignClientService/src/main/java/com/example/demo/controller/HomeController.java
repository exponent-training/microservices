package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MainInterface;

@RestController
public class HomeController {

	
	@Autowired
	private MainInterface mainInterface;
	
	@GetMapping(value = "/getname")
	public String getData() {
		String str = mainInterface.getData();
		return str;
	}
	
	@GetMapping(value = "/get/{id}")
	public String getData1(@PathVariable int id) {
		String str = mainInterface.getData(id);
		return str;
	}
	
}
