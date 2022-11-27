package br.com.api.apitestunitarios.services;

import br.com.api.apitestunitarios.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User>findAll();

}
