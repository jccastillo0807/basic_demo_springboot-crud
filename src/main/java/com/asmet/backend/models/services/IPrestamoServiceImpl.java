package com.asmet.backend.models.services;

import com.asmet.backend.models.dao.IPrestamoDao;
import com.asmet.backend.models.entity.Prestamo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IPrestamoServiceImpl implements IPrestamoService{
    private final IPrestamoDao prestamoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Prestamo> findAll() {
        return (List<Prestamo>) prestamoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Prestamo findById(Long id) {
        return prestamoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Prestamo create(Prestamo prestamo ) {
        return prestamoDao.save(prestamo);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        prestamoDao.deleteById(id);
    }
}
