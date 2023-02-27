package com.asmet.backend.models.dao;

import com.asmet.backend.models.entity.Prestamo;
import org.springframework.data.repository.CrudRepository;

public interface IPrestamoDao  extends CrudRepository<Prestamo, Long> {
}
