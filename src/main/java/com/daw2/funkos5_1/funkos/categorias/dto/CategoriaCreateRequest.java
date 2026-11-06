package com.daw2.funkos5_1.funkos.categorias.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoriaCreateRequest(
        @Size(max = 50, message = "nombre de categoria maximo 50")
        @NotBlank(message = "Debes escribir una categoria")
        String nombre
        ) {
}
