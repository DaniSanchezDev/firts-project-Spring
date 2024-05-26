package edu.daniel.projectJPA.entities;

import jakarta.persistence.Entity;

@Entity
public class Animal {
    private Long id;
    private String nombre;
    private String especie;
    private Double peso;
    private Integer edad;

    public Animal() {}

    public Animal(Long id, String nombre, String especie, Double peso, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", peso=" + peso + ", edad=" + edad
                + "]";
    }

    
    
}




