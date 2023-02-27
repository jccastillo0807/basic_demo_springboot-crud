package com.asmet.backend.models.services;

import com.asmet.backend.models.dao.IAutorDao;
import com.asmet.backend.models.entity.Autor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IAutorServiceImpl implements IAutorService {

    private final IAutorDao autorDao;
   /* @Autowired
    private IAutorDao autorDao;*/

    @Override
    @Transactional(readOnly = true)
    public List<Autor> findAll() {
        return (List<Autor>) autorDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Autor findById(Long id) {
        return autorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Autor create(Autor autor) {
        return autorDao.save(autor);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        autorDao.deleteById(id);
    }
}
