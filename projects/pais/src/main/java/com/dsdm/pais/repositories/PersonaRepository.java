package com.dsdm.pais.repositories;

import com.dsdm.pais.entities.Persona;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    
}
