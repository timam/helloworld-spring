package com.timam.backend.controller;

import com.timam.backend.response.Result;
import com.timam.common.dto.DataResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BackendController {
    @Value("${app.profile}")
    private String profile;

    @GetMapping(value = "/")
    public Result getResult(){
        Result result = Result.builder().message("Hello").profile(profile).build();
        log.info("Writing log from backend");
        return result;
    }

    @GetMapping(value = "/data-response")
    public DataResponse getDataResponse(){
        log.info("Returning data response from backend");
        return DataResponse.builder().param1("param 1").param2("param 2").build();
    }

}
