package com.tms.lessons43car.exc;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class StoreFailedException extends RuntimeException{

    private final String errorMessage;

    public StoreFailedException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
