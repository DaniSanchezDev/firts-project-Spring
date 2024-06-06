package edu.daniel.projectJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.daniel.projectJPA.Enumerate.Especie;
import edu.daniel.projectJPA.entities.Animal;
import edu.daniel.projectJPA.repositories.IAnimalesRepository;

@SpringBootApplication
public class ProjectJpaApplication implements CommandLineRunner {

	@Autowired
	IAnimalesRepository animalRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProjectJpaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		List<Animal> lista = animalRepo.findAll();
		System.out.println(lista);

		// Se hace un delete en la BBDD (Se necesita un ID para borrar sin él solo hace un UPDATE)
		// animalRepo.delete(new Animal(4,"Loira", "Humano", 80.0, 21));
		// animalRepo.deleteById(3);

		// Si se guarda un objeto ya creado una vez pero con diferentes datos se hace un UPDATE en la base;
		// System.out.println("Animal actualizado" + animalRepo.save(animalActualizar));

		System.out.println(animalRepo.findAll());
		System.out.println(animalRepo.findById(1));


		Optional<Animal> op = animalRepo.findById(1);

		if(!op.isPresent()){
			System.out.println("NO HAY UN OBJETO CON ESTE ID! ");
		}else{
			System.out.println(op.get());
		}

		
		animalRepo.save(new Animal("Felix", Especie.FELINO, 15.4,7));

		System.out.println(animalRepo.findAll());

	}

}
