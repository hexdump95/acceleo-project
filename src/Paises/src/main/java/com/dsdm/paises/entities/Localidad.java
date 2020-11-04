package com.dsdm.paises.entities;


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

public class Localidad extends BaseEntity {

    @Column(name = "", unique = true)
    private int numero;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;


}
