package edu.daniel.projectJPA.entities;

import jakarta.persistence.Entity;

@Entity
public class Animal {
    private Long id;
    private String nombre;
    private String especie;
    private Double peso;
    private Integer edad;
    

}
