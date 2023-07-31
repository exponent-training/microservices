package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeConsumeServiceImpl implements EmployeeConsumeService{
	
	@Override
	public Employee employeeConsume() {
		// TODO Auto-generated method stub
		Employee employee = consume(new Employee());
		return employee;
	}

	@KafkaListener(topics = "topicone",groupId = "rest_one")
	public Employee consume(Employee employee) {
		System.out.println("Employee Consumed Data : " +  employee);
	   return employee;
	}
	
	
}
