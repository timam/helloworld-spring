package com.timam.frontend;

import com.timam.common.dto.DataResponse;
import com.timam.frontend.api.BackendApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class FrontendController {
    private final BackendApiService backendApiService;

    public FrontendController(BackendApiService backendApiService) {
        this.backendApiService = backendApiService;
    }

    @GetMapping("/")
    public String sayHello(){

        log.info("Writing from frontend");
        return "Hello from frontend";
    }

    @GetMapping("/data-response")
    public DataResponse getDataResponse(){
        log.info("Returning data response from frontend");
        return backendApiService.getDataResponse();
    }
}
