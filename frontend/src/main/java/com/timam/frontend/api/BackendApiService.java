package com.timam.frontend.api;


import com.timam.common.dto.DataResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "backend-api-client", url = "${backend.api}")
public interface BackendApiService {
    @GetMapping("/data-response")
    DataResponse getDataResponse();

}
