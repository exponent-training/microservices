package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.KafkaProducerService;

@RestController
public class ProducerController {
	
	@Autowired
	private KafkaProducerService kafkaProducerService; 

	@PostMapping(value = "/publish")
	public String msgProducer(@RequestBody Student student) {
		kafkaProducerService.msgPublish(student);
		return "Data Published.";
	}
}
