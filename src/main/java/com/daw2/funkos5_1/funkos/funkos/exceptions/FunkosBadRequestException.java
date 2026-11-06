package com.daw2.funkos5_1.funkos.funkos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FunkosBadRequestException extends RuntimeException {
    public FunkosBadRequestException(String message) {
        super(message);
    }
}
