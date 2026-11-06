package com.daw2.funkos5_1.funkos.categorias.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CategoriaBadRequestException extends RuntimeException {
    public CategoriaBadRequestException(String message) {
        super(message);
    }
}
