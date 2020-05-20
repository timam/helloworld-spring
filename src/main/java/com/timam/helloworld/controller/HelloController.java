package com.timam.helloworld.controller;

import com.timam.helloworld.response.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.profile}")
    private String profile;

    @GetMapping(value = "/hello")
    public Result getResult(){
        Result result = Result.builder().message("Hello").profile(profile).build();
        return result;
    }

}
