package com.example.PortfolioAPI.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Accomplissement {
      @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
      @Column( updatable = false, nullable = false)
     private Long id;

    private String typeAccomplissement; 
    private String nom;
    private LocalDate dateRealisation;
    private String technologie;

    @Column(columnDefinition = "TEXT")
    private String description;
 public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    public Accomplissement() {
    }


 
    public String getTypeAccomplissement() {
        return typeAccomplissement;
    }
    public void setTypeAccomplissement(String typeAccomplissement) {
        this.typeAccomplissement = typeAccomplissement;


}

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateRealisation() {
        return dateRealisation;
    }
    public void setDateRealisation(LocalDate dateRealisation) {
        this.dateRealisation = dateRealisation;
    }

    public String getTechnologie() {
        return technologie;
    }
    public void setTechnologie(String technologie) {
        this.technologie = technologie;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


     public Accomplissement(String typeAccomplissement, String nom, LocalDate dateRealisation, String technologie, String description) {
        this.typeAccomplissement = typeAccomplissement;
        this.nom = nom;
        this.dateRealisation = dateRealisation;
        this.technologie = technologie;
        this.description = description;
    }

    @Override
public String toString() {
    return "Accomplissement{" +
            "id=" + id +
            ", typeAccomplissement='" + typeAccomplissement + '\'' +
            ", nom='" + nom + '\'' +
            ", dateRealisation=" + dateRealisation +
            ", technologie='" + technologie + '\'' +
            ", description='" + description + '\'' +
            '}';
}

    



}
