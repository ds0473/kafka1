package com.kafka.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.kafka.model.Model;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "${kafka.topic.request-topic}")
	@SendTo("requestreply-topic")
	public Model listen(Model request) throws InterruptedException {
		int sum = request.getFirstNumber() + request.getSecondNumber();
		request.setAdditionalProperty("sum", sum);
		return request;
	}

}
