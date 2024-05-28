package edu.daniel.projectJPA;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

	}

}
