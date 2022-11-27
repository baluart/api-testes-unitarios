package br.com.api.apitestunitarios.services;

import br.com.api.apitestunitarios.domain.User;

public interface UserService {
    User findById(Integer id);
}
