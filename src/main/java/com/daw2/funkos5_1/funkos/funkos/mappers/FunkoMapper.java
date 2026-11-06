package com.daw2.funkos5_1.funkos.funkos.mappers;

import com.daw2.funkos5_1.funkos.categorias.models.Categoria;
import com.daw2.funkos5_1.funkos.funkos.dto.FunkoCreateRequest;
import com.daw2.funkos5_1.funkos.funkos.dto.FunkoResponse;
import com.daw2.funkos5_1.funkos.funkos.dto.FunkoUpdateRequest;
import com.daw2.funkos5_1.funkos.funkos.models.Funko;
import com.daw2.funkos5_1.funkos.funkos.repositories.FunkoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FunkoMapper  {
    // Entidad a DTO
    //devuelvo 1 funko a 1 dto
    public FunkoResponse toResponse(Funko f){
        return new FunkoResponse(
                f.getId(), f.getNombre(),f.getPrecio(),f.getCantidad(),
                f.getCategoria().getNombre(), f.getCreatedAt(),
                f.getUpdatedAt()
        );
    }

    //devuelvo lista de funkos a lista de dtos
    public List<FunkoResponse> toResponse(List<Funko> funkos){
        return funkos.stream().map(this::toResponse).toList();
    }

    // DTO A ENTIDAD
    // POST (devuelvo Funko )
    public Funko toModel(FunkoCreateRequest f, Categoria c){
        return new Funko(
                f.nombre().trim(), f.precio(), f.cantidad(), c
        );
    }

    // PUT - como reemplazo todo no valido nulls
    public void reemplazar(Funko f, FunkoCreateRequest r, Categoria c){
        f.setNombre(r.nombre().trim());
        f.setPrecio(r.precio());
        f.setCantidad(r.cantidad());
        f.setCategoria(c);
    }

    // PATCH
    public void parchear(Funko f, FunkoUpdateRequest r, Categoria c){
        if(r.nombre()!=null) f.setNombre(r.nombre().trim());
        if(r.precio()!=null) f.setPrecio(r.precio());
        if(r.cantidad()!=null) f.setCantidad(r.cantidad());
        if(c!=null) f.setCategoria(c);
    }

}
