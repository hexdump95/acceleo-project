package com.dsdm.pais.services;

import com.dsdm.pais.entities.Persona;
import com.dsdm.pais.repositories.BaseRepository;
import com.dsdm.pais.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }

}
