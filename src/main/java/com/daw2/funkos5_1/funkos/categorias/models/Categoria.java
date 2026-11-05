package com.daw2.funkos5_1.funkos.categorias.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column(length = 50, unique = true)
    @Getter @Setter
    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    protected Categoria(){}

}
