package com.asmet.backend.models.services;

import com.asmet.backend.models.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario create(Usuario usuario);

    public void delete(Long id);
}
