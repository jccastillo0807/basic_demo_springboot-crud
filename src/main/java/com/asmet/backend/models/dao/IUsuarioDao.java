package com.asmet.backend.models.dao;

import com.asmet.backend.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao  extends CrudRepository<Usuario, Long> {
}
