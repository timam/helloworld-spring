package com.timam.frontend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontendController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from frontend";
    }
}
