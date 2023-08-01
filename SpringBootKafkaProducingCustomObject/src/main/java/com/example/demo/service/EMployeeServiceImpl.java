package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EMployeeServiceImpl implements EmployeeService{

	//@Value(value = "${topic.name}")
	//private String topic;
	
	@Autowired
	private KafkaTemplate<String, Employee> kafkaTemplate;
	
	@Override
	public void employeeDataublish(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Kafka Producer Start.");
		kafkaTemplate.send("topicone", employee);
		System.out.println("Kafka Producer End.");
	}

	
}
