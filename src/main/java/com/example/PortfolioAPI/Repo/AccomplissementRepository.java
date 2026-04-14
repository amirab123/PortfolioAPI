package com.example.PortfolioAPI.Repo;


import com.example.PortfolioAPI.Model.Accomplissement;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccomplissementRepository  extends JpaRepository <Accomplissement, Long>{

      List<Accomplissement> findByTypeAccomplissement(String typeAccomplissement);

    List<Accomplissement> findByTechnologie(String technologie);




}
