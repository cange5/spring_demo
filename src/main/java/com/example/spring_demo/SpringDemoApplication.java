package com.example.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //è come noi esponiamo le API, è il figlio di Contoller va bene pure però è meglio RestController
public class SpringDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringDemoApplication.class, args);


    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";

    }
}
