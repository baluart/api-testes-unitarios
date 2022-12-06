package br.com.api.apitestunitarios.config;

import br.com.api.apitestunitarios.domain.User;
import br.com.api.apitestunitarios.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {
    @Autowired
    private UserRepository repository;

    @Bean
    public void starDB(){
        User u1 = new User(null,"lucas","lucasbaluart@gmail.com","123");
        User u2 = new User(null,"ester","ester.lima.ferreira@gmail.com","123");

        repository.saveAll(List.of(u1,u2));
    }
}
