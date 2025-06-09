package com.abhishek.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/abc")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/java")
    public String helloJava() {
        return "Hello, Java World!";
    }
}

