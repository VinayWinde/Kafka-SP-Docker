package com.kafspring.kafSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
public class Kafcontroller {

    @Autowired
    private Producer producer;

    @PostMapping("/topic")
    public String addMsg(@RequestParam ("mes") String message){


        this.producer.SendMsg(message);
        return "ADDED_MESSAGE";
    }



}
