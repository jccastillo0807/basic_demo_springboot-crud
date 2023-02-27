package com.asmet.backend.models.services;

import com.asmet.backend.models.entity.Libro;

import java.util.List;

public interface ILibroService {
    public List<Libro> findAll();

    public Libro findById(Long id);

    public Libro create(Libro libro);

    public void delete(Long id);
}
