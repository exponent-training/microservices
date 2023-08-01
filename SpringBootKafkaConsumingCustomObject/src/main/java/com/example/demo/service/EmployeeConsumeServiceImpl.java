package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeConsumeServiceImpl implements EmployeeConsumeService{
	
	@Override
	public Employee employeeConsume() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@KafkaListener(topics = "topicone",groupId = "rest_one")
	public void consume(Employee employee) {
		System.out.println("Employee Consumed Data : " +  employee);
	     
	}
	
}
