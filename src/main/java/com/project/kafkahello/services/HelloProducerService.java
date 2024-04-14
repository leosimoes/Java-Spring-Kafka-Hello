package com.project.kafkahello.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducerService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public HelloProducerService(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        this.kafkaTemplate.send("hello-topic", message);
    }
}