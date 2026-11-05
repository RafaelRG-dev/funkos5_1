package com.daw2.funkos5_1.funkos.funkos.repositories;

import com.daw2.funkos5_1.funkos.funkos.models.Funko;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FunkoRepository extends JpaRepository<Funko, Long> {
    //GET api/v1/funkos?page=0&size=20&sort=precio,
    //sort y filtros por paginas
    //select f from Funko f where f.deleted = false
    Page<Funko> findAllByDeletedFalse(Pageable p);

    //GET desc&categoria=anime&nombre=go&precioMax=25
    //TODO hacer esto

    //GET api/v1/funkos/{id}
    // selecciona un funko por id con deleted false
    // select f from Funko f where f.deleted = false and f.id = :id
    Funko findByDeletedFalseAndId(Long id);

    //POST api/v1/funkos,
    //Funko save(Funko f)

    // PUT /api/v1/funkos/{id}, PATCH /api/v1/funkos/{id}
    // CON SETTER DE FUNKO EN SERVICE

    // /api/v1/funkos/{id}     ← borrado lógico
    @Modifying
    @Query("update Funko f set f.deleted=true where f.id=:id")
    void borradoLogico(@Param("id") Long id);
}
