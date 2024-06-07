package edu.daniel.projectJPA.entities;

import edu.daniel.projectJPA.Enumerate.Especie;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
// Mapear spring con la BBDD
@Table(name = "animales")
public class Animal {

    // creamos el decorador para el id
    @Id
    //esto es para decir que es auto incremental el id el decorador. Le pasamos la estrategia que es auto
    @GeneratedValue(strategy = GenerationType.IDENTITY)
       
    private Integer id;
    //Este decorador cambia el nombre de la columna de la BBDD, si no esta creada la columna, la crea
    @Column(name = "nombre", length = 255, nullable = false, unique = true)
    private String nombre;
    //Convierte el enumerado en un string y despues en la bbdd lo convierte a varchar
    @Enumerated(EnumType.STRING)
    @Column(name = "especie", columnDefinition = "ENUM('CANINO', 'FELINO', 'SIMIO', 'PEZ', 'REPTIL')")
    private Especie especie;
    private Double peso;
    private Integer edad;

    public Animal() {}

    public Animal(Integer id, String nombre, Especie especie, Double peso, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
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

    public Animal(String nombre, Especie especie, Double peso, Integer edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }


    
    
    
}