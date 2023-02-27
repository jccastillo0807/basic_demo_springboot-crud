package com.asmet.backend.models.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @NotEmpty
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    private String direccion;

    private String telefono;

    @NotEmpty
    private String nombre;

    private static final long serialVersionUID = 1L;
}
