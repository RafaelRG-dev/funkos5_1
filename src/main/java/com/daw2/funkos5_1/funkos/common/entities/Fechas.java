package com.daw2.funkos5_1.funkos.common.entities;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class Fechas {
    @Column(name = "created_at",  updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate(){
        var ahora = LocalDateTime.now();
        this.createdAt=ahora;
        this.updatedAt=ahora;
    }
    @PreUpdate
    protected void onUpdate(){
        var ahora = LocalDateTime.now();
        this.updatedAt=ahora;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }


}
