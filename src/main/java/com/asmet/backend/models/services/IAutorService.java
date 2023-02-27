package com.asmet.backend.models.services;

import com.asmet.backend.models.entity.Autor;

import java.util.List;

public interface IAutorService {
    public List<Autor> findAll();

    public Autor findById(Long id);

    public Autor create(Autor autor);

    public void delete(Long id);
}
