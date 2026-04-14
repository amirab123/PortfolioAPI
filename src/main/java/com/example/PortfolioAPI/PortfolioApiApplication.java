
package com.example.PortfolioAPI;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.PortfolioAPI.Model.Accomplissement;
import com.example.PortfolioAPI.Repo.AccomplissementRepository;

@SpringBootApplication
public class PortfolioApiApplication  implements CommandLineRunner{
  private final AccomplissementRepository repository;

    public PortfolioApiApplication(AccomplissementRepository repository) {
        this.repository = repository;
    }
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApiApplication.class, args);
	}

	  @Override
    public void run(String... args) throws Exception { 

       
          repository.save(new Accomplissement("Projet A", "Description du projet A", LocalDate.of(2023, 1, 15), "Développement web", "Java, Spring Boot"));
         repository.save(new Accomplissement("Projet B", "Description du projet B", LocalDate.of(2023, 3, 10), "Data Science", "Python, Pandas"));
          repository.save(new Accomplissement("Projet C", "Description du projet C", LocalDate.of(2023, 5, 20), "Mobile App", "Flutter, Dart"));


    }


}
