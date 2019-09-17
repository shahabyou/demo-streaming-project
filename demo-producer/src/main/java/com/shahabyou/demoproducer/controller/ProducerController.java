package com.shahabyou.demoproducer.controller;


import com.shahabyou.demoproducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

    @Autowired
    Environment environment;

    @Autowired
    ProducerService producerService;

    @GetMapping(value = "/publish")
    public String publishHealthCheck(){
        return environment.getProperty("message.response");
    }

    @PostMapping(path = "/publish")//, consumes = "application/json", produces = "application/json")
    public String publish(@RequestBody String message){
        producerService.sendMessage(message);
        return "Message has been sent";
    }


}
