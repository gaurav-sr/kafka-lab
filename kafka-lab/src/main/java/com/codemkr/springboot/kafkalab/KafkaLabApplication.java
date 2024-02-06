package com.codemkr.springboot.kafkalab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaLabApplication.class, args);
	}

	@KafkaListener(topics = "my-kafka-topic-01", groupId = "test-consumer-group")
	public void listen(String message) {
		System.out.println("Received Messasge in group group_id: " + message);
	}

}
