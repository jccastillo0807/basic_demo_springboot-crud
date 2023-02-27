package com.asmet.backend.models.dao;

import com.asmet.backend.models.entity.Autor;
import org.springframework.data.repository.CrudRepository;

public interface IAutorDao extends CrudRepository<Autor, Long> {
}
