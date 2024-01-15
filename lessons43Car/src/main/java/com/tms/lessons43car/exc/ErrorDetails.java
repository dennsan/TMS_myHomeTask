package com.tms.lessons43car.exc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ErrorDetails {
    private String serviceName;
    private String message;
    private Integer code;
}
