package com.dsdm.paises.repositories;

import com.dsdm.paises.entities.Persona;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    
}
