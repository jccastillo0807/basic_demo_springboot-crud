package com.asmet.backend.models.services;


import com.asmet.backend.models.entity.Prestamo;

import java.util.List;

public interface IPrestamoService {
    public List<Prestamo> findAll();

    public Prestamo findById(Long id);

    public Prestamo create(Prestamo prestamo);

    public void delete(Long id);
}
