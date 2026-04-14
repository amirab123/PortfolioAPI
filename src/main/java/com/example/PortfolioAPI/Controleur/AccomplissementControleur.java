package com.example.PortfolioAPI.Controleur;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PortfolioAPI.Model.Accomplissement;
import com.example.PortfolioAPI.Repo.AccomplissementRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



import java.util.List;


@RestController
@RequestMapping("/accomplissements")
@CrossOrigin(origins = "http://localhost:4200")

 
public class AccomplissementControleur {


private final AccomplissementRepository repository;


public AccomplissementControleur(AccomplissementRepository repository) {
    this.repository = repository;

}

    @PostMapping
    public Accomplissement ajouterAccomplissement(@RequestBody Accomplissement a) {
        return repository.save(a);
    }


    @GetMapping
    public List<Accomplissement> listerAccomplissements() {
        return repository.findAll();
    }


    @DeleteMapping("/{id}")
    public void supprimerAccomplissement(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/type/{type}")
    public List<Accomplissement> recupererParType(@PathVariable String type) {
        return repository.findByTypeAccomplissement(type);
    }

   
    @GetMapping("/technologie/{tech}")
    public List<Accomplissement> recupererParTechnologie(@PathVariable("tech") String technologie) {
        return repository.findByTechnologie(technologie);
    }

   
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World amira!";
    }
}