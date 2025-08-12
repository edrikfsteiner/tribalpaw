package com.tribalpaw.api.handler;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class ExceptionDetails {
    private LocalDateTime timestamp;
    private Integer status;
    private String details;
}