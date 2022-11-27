package br.com.api.apitestunitarios.services.impl;

import br.com.api.apitestunitarios.domain.User;
import br.com.api.apitestunitarios.repositories.UserRepository;
import br.com.api.apitestunitarios.services.UserService;
import br.com.api.apitestunitarios.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não Encontrado"));
    }

    public List<User> findAll(){
        return repository.findAll();
    }
}
