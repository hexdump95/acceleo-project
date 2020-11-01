package com.dsdm.persona.repositories;

import com.dsdm.persona.entities.Localidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
    
}
