package com.dsdm.persona.repositories;

import com.dsdm.persona.entities.Persona;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    
}
