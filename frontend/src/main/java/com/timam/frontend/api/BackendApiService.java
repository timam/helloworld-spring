package com.timam.frontend.api;


import com.timam.common.dto.DataResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "backend-api-client", url = "http://localhost:8010/backend")
public interface BackendApiService {
    @GetMapping("/data-response")
    DataResponse getDataResponse();

}
