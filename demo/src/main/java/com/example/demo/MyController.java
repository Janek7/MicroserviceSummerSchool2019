package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private int counter = 0;

    @RequestMapping("/hello")
    public String hello(String name) {
        System.out.println("Request " + counter + " received!");
        counter++;
        return "Hello Microservice-World! Welcome " + (name != null ? name : "") + "!";
    }
}
