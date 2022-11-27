package br.com.api.apitestunitarios.services;

import br.com.api.apitestunitarios.domain.User;
import br.com.api.apitestunitarios.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User>findAll();
    User create(UserDTO obj);
    User update (UserDTO obj);

}
