package com.daw2.funkos5_1.funkos.funkos.repositories;

import com.daw2.funkos5_1.funkos.funkos.models.Funko;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FunkoRepository extends JpaRepository<Funko, Long> {
    Page<Funko> findAllByDeletedFalse(Pageable p);
}
