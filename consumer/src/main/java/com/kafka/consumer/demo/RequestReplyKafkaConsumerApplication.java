package com.kafka.consumer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@ComponentScan(basePackages = { "com.kafka.consumer.config", "com.kafka.consumer.model",
		"com.kafka.consumer.consumer" })
public class RequestReplyKafkaConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RequestReplyKafkaConsumerApplication.class, args);
	}
}
