package com.timam.backend.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {
    private String message;
    private String profile;
}
