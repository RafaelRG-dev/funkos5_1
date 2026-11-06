package com.daw2.funkos5_1.funkos.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler  {
    // TODO estudiar esto:
    //MethodArgument -> 400BR           - validacion()      cuando falla @Valid
    //HttpMessageNotReadable -> 400BR   - jsonIlegible()    cuando DTO no puede leer por estar mal formado
    //MethodArgumentTypMsmatch -> 400BR - tipoMalo()        cuando se introduce tipo incorrecto en controller
    //PropertyReference -> 400BR        - ordenacionMala()  cuando campo no existe en @Entity
    //DataIntegrityViolation -> 409C    - integridad()      viola integridad de BBDD
    //Exception -> 500IS                - errorInterno()    error 500 msg personalizado

    // Errores de validacion @Valid error 400
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> validacion(MethodArgumentNotValidException ex){
        Map<String, String> campos = new LinkedHashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->
                campos.put(error.getField(), error.getDefaultMessage()));
        return Map.of("status", 400,
                "error", "Datos de entrada inválidos",
                "campos",campos);
    }
}
