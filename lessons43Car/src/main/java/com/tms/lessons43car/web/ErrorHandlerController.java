package com.tms.lessons43car.web;

import com.tms.lessons43car.exc.ErrorDetails;
import com.tms.lessons43car.exc.StoreFailedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandlerController {

    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handle(StoreFailedException exc) {
        String errorMessage = exc.getErrorMessage();
        ErrorDetails errorDetails = ErrorDetails.builder()
                .serviceName("car-service")
                .message(errorMessage)
                .code(400)
                .build();
        return ResponseEntity.status(400)
                .body(errorDetails);
    }
}
