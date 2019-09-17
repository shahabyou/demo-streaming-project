package com.shahabyou.democonsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @GetMapping(value = "/message")
    public String  consumerHealthCheck(){
        return "Consumer is Healthy";
    }
}
