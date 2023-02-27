package com.asmet.backend.models.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "prestamos")
@Data
public class Prestamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "fecha_prestamo", nullable = false)
    private Date fechaPrestamo;

    @NotEmpty
    @Column(name = "fecha_devolucion", nullable = false)
    private Date fechaDevolucion;

    private static final long serialVersionUID = 1L;
}
