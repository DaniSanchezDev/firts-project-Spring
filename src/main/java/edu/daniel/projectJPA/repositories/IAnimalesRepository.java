package edu.daniel.projectJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daniel.projectJPA.entities.Animal;

public interface IAnimalesRepository extends JpaRepository <Animal, Integer>{

}

