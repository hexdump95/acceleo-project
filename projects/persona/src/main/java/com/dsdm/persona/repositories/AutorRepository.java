package com.dsdm.persona.repositories;

import com.dsdm.persona.entities.Autor;

import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
    
}
