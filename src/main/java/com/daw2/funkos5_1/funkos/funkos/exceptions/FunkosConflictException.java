package com.daw2.funkos5_1.funkos.funkos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class FunkosConflictException extends RuntimeException {
    public FunkosConflictException(String message) {
        super(message);
    }
}
