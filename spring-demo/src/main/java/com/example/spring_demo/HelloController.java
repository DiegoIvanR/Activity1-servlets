package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
    private final MessageService service;
 
    // Constructor-based Dependency Injection
    public HelloController(MessageService service) {
        this.service = service;
    }
 
    @GetMapping("/hello")
    public String hello() {
        return service.getMessage();
    }
}