package com.example.PortfolioAPI.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PortfolioAPI.Model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); 
    

}
