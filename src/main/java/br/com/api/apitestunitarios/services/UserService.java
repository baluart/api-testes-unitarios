package br.com.api.apitestunitarios.services;

import br.com.api.apitestunitarios.domain.User;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserService {
    User findById(Integer id);
}
