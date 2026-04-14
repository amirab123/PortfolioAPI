package com.example.PortfolioAPI.Controleur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PortfolioAPI.Repo.UserRepository;
import com.example.PortfolioAPI.Model.User;


@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthControleur {

 @Autowired
    private UserRepository repo;


    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return repo.save(user);
    }


    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return repo.findByUsername(user.getUsername())
                   .map(u -> {
                       if (u.getPassword().equals(user.getPassword())) {
                           return "Connexion réussie ! Rôle : " + u.getRole();
                       } else {
                           return "Mot de passe incorrect";
                       }
                   })
                   .orElse("Utilisateur non trouvé");
    }
    
}
