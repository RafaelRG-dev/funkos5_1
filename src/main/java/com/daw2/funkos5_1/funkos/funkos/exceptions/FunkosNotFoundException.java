package com.daw2.funkos5_1.funkos.funkos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FunkosNotFoundException extends RuntimeException {
    public FunkosNotFoundException(Long id)
    {
        super("No se ha encontrado el funko con ID: "+id);
    }
}
