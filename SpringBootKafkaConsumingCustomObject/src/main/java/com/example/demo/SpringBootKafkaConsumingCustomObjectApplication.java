package com.example.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class SpringBootKafkaConsumingCustomObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaConsumingCustomObjectApplication.class, args);
	}

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("topicone").partitions(2).replicas(1).build();
	}
	
}
