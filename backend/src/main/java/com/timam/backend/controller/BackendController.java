package com.timam.backend.controller;

import com.timam.backend.response.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
    @Value("${app.profile}")
    private String profile;

    @GetMapping(value = "/")
    public Result getResult(){
        Result result = Result.builder().message("Hello").profile(profile).build();
        return result;
    }

}
