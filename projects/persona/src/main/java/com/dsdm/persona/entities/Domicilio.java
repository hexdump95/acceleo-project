package com.dsdm.persona.entities;


import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinTable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Domicilio extends BaseEntity {

    @Column(name = "", unique = true)
    private String calle;

    @Column(name = "", unique = true)
    private int numero;




    @ManyToOne()
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;


}
