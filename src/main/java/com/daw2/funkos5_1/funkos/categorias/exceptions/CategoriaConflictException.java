package com.daw2.funkos5_1.funkos.categorias.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CategoriaConflictException extends RuntimeException {
    public CategoriaConflictException(String message) {
        super(message);
    }
}
