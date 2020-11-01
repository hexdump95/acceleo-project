package com.dsdm.persona.services;

import com.dsdm.persona.entities.Autor;
import com.dsdm.persona.repositories.BaseRepository;
import com.dsdm.persona.repositories.AutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

}

