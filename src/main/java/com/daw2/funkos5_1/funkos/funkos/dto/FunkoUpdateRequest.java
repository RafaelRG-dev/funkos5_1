package com.daw2.funkos5_1.funkos.funkos.dto;


import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record FunkoUpdateRequest(
        @Size(max = 100, message = "El nombre tiene máximo 100 caracteres")
        String nombre,

        @DecimalMin(value = "0.0", inclusive = false, message = "El precio minimo son 0.0")
        BigDecimal precio,

        @PositiveOrZero(message = "Debe ser positivo")
        Integer cantidad,

        @Size(max = 50, message = "La categoria tiene máximo 50")
        String categoria
){
}
