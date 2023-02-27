package com.asmet.backend.models.services;

import com.asmet.backend.models.dao.ILibroDao;
import com.asmet.backend.models.entity.Libro;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ILibroServiceImpl implements ILibroService {
    private final ILibroDao libroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Libro> findAll() {
        return (List<Libro>) libroDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Libro findById(Long id) {
        return libroDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Libro create(Libro libro) {
        return libroDao.save(libro);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        libroDao.deleteById(id);
    }
}
