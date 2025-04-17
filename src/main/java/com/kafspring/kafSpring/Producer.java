package com.kafspring.kafSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    public static final String SEND_MESSAGE="topic-message";

    @Autowired
      public KafkaTemplate<String,String> kt;


      public void SendMsg(String message){
          this.kt.send(SEND_MESSAGE,message);
      }


}
