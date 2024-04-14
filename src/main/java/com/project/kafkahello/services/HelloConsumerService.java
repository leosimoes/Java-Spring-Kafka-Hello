package com.project.kafkahello.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumerService {

    @KafkaListener(topics = "hello-topic", groupId = "group-1")
    public void receiveMessage(String message) {
        System.out.println("Consumer Message: " + message);
    }

}
