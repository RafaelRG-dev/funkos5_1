package com.daw2.funkos5_1.funkos.funkos.dto;


import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record FunkoCreateRequest(
        @NotBlank(message = "El nombre no debe estar vacio")
        @Size(max = 100, message = "El nombre tiene máximo 100 caracteres")
        String nombre,

        @DecimalMin(value = "0.0", inclusive = false, message = "El precio minimo son 0.0")
        @NotNull(message = "debes introducir el precio")
        @Digits( integer = 8, fraction = 2)
        BigDecimal precio,

        @PositiveOrZero(message = "Debe ser positivo")
        @NotNull(message = "debes introducir la cantidad")
        Integer cantidad,

        @NotBlank(message = "Debes introducir una categoria")
        @Size(max = 50, message = "La categoria tiene máximo 50")
        String categoria
){
}
