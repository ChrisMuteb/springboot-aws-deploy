package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData(){
        return "Lord of the Cloud: Educational System";
    }

    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to Lord of the Cloud";
    }
}
