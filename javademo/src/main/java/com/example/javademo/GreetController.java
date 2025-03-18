package com.example.javademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/api/greet")
    public String greet() {
        return "Greetings from Spring Boot!";
    }
}
