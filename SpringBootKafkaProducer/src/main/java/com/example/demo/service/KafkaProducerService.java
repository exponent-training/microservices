package com.example.demo.service;

import com.example.demo.model.Student;

public interface KafkaProducerService {
	
	void msgPublish(Student student);

}
