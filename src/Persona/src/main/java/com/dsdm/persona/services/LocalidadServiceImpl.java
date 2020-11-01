package com.dsdm.persona.services;

import com.dsdm.persona.entities.Localidad;
import com.dsdm.persona.repositories.BaseRepository;
import com.dsdm.persona.repositories.LocalidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

}

