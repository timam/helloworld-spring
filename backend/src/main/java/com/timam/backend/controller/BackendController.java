package com.timam.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from backend";
    }
}