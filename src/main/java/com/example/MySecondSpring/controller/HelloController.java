package com.example.MySecondSpring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    // GET request example
    @GetMapping("/param/{firstName}")
    public String getHelloMessage(@PathVariable String firstName, @RequestParam String lastName) {
        logger.info("Received GET request with firstName: {} and lastName: {}", firstName, lastName);
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }

    // POST request example
    @PostMapping("/post")
    public String postHelloMessage(@RequestBody User user) {
        logger.info("Received POST request with User: {}", user);
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }

    // PUT request example
    @PutMapping("/put/{firstName}")
    public String putHelloMessage(@PathVariable String firstName, @RequestParam String lastName) {
        logger.info("Received PUT request with firstName: {} and lastName: {}", firstName, lastName);
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }
}