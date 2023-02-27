package com.asmet.backend.models.dao;

import com.asmet.backend.models.entity.Libro;
import org.springframework.data.repository.CrudRepository;

public interface ILibroDao  extends CrudRepository<Libro, Long> {
}
