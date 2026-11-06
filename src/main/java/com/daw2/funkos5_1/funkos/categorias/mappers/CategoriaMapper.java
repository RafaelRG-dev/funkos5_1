package com.daw2.funkos5_1.funkos.categorias.mappers;

import com.daw2.funkos5_1.funkos.categorias.dto.CategoriaCreateRequest;
import com.daw2.funkos5_1.funkos.categorias.dto.CategoriaResponse;
import com.daw2.funkos5_1.funkos.categorias.models.Categoria;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriaMapper {
    // ENTITY DTO
    // GET
    public CategoriaResponse toResponse(Categoria c, long nFunkos){
        return new CategoriaResponse(
                c.getId(), c.getNombre(), nFunkos
        );
    }

    // DTO ENTITY
    // POST
    public Categoria toModel(CategoriaCreateRequest c){
        return new Categoria(c.nombre().trim().toUpperCase());
    }
}
