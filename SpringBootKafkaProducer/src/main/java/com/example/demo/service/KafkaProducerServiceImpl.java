package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService{

	@Autowired
	 private
	 KafkaTemplate<String, String> kafkaTemplate;
	
	 private final String TOPIC = "kafkaTopic";
	
	@Override
	public void msgPublish(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Kafka Msg Producer: Start ");
		//ObjectMapper objectMapper = new ObjectMapper();
		
		this.kafkaTemplate.send(TOPIC, student.toString());
		System.out.println("Kafka Msg Producer: End ");
	}

}
