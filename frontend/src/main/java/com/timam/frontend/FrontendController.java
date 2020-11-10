package com.timam.frontend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class FrontendController {
    @GetMapping("/")
    public String sayHello(){

        log.info("Writing from frontend");
        return "Hello from frontend";
    }
}
