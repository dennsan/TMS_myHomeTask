package org.tms.lessons31.web.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.tms.lessons31.web.exception.WorkerException;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(WorkerException.class)
    public String getError() {
        return "error";
    }
}
