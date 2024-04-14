package com.project.kafkahello.controllers;


import com.project.kafkahello.services.HelloProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class HelloController {
    private final HelloProducerService service;

    @Autowired
    public HelloController(HelloProducerService service){
        this.service = service;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        this.service.sendMessage("Hello, " + name);
        return "OK";
    }

}
