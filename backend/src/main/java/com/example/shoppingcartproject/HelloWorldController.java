package com.example.shoppingcartproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello " + name + "!";
    }
}
