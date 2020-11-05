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

public class Libro extends BaseEntity {

    @Column(name = "fecha", unique = true)
    private Date fecha;

    @Column(name = "genero", unique = true)
    private String genero;

    @Column(name = "paginas", unique = true)
    private int paginas;

    @Column(name = "titulo", unique = true)
    private String titulo;




    @ManyToMany()
    @JoinTable(name = "libro_autor")
    private List<Autor> autores;


}
