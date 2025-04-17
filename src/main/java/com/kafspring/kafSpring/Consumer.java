package com.kafspring.kafSpring;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics="topic-message",groupId = "grp")
    public void RecMsg(String message){
        System.out.println("MESSAGE_BY_PRODUCER : "+message);
    }

}
