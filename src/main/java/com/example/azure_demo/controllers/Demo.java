package com.example.azure_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/marco")
    public String polo(){
        return "POLO!";
    }

    @GetMapping("/joke")
    public String joke(){
        return "I don't trust stairs. They're always up to something.";
    }
}
