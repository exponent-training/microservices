package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeConsumeService;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaConsumerController {

	@Autowired
	private EmployeeConsumeService employeeConsumeService;
	
	@GetMapping(value = "/consume")
	public Employee getConsumeData() {
	   Employee employee = employeeConsumeService.employeeConsume();		
		return employee;
	}
	
}
