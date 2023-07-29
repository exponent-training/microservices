package com.example.demo.service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class KafkaConsumerService {

	 @KafkaListener(topics = "kafkaTopic", groupId = "group_id")
	    public void consume(String student) {
        System.out.println("Print Consumer Msg : " + student);
	 }
}
