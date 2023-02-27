package com.asmet.backend.models.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libros")
@Data
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;

   /*@JoinTable(
            name = "rel_libros_autores",
            joinColumns = @JoinColumn(name = "FK_LIBRO", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "FK_AUTOR", nullable = false)
    )*/

    /*@ManyToMany
    @JoinTable(
            name = "libros_autores",
            joinColumns = @JoinColumn(name = "id_libro", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_autor", nullable = false)
    )
    private List<Autor> autoresList;*/

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "libro", cascade = CascadeType.ALL)
    private List<LibrosAutores> librosAutoresList;

    public Libro() {
        this.librosAutoresList = new ArrayList<>();
    }

    private static final long serialVersionUID = 1L;
}
