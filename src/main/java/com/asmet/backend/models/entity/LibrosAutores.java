package com.asmet.backend.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "libros_autores")
@Data
public class LibrosAutores implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_libro")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Libro libro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_autor")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Autor autor;


    private static final long serialVersionUID = 1L;
}
