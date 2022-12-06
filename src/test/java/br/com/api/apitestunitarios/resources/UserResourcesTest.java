package br.com.api.apitestunitarios.resources;

import br.com.api.apitestunitarios.domain.User;
import br.com.api.apitestunitarios.domain.dto.UserDTO;
import br.com.api.apitestunitarios.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class UserResourcesTest {

    public static final Integer ID      = 1;
    public static final String NOME     = "lucas";
    public static final String EMAIL    = "lucasbaluart@gmail.com";
    public static final String PASSWORD = "123";
    public static final String OBJETO_NAO_ENCONTRADO = "Objeto nao Encontrado";
    public static final int INDEX = 0;
    public static final String MAIL_JA_CADASTRADO_NO_SISTEMA = "E-mail já cadastrado no sistema";
    public static final String NAO_ENCONTRADO = "Objeto nao encontrado";

    @InjectMocks
    private UserResources resources;
    @Mock
    private UserServiceImpl service;
    @Mock
    private ModelMapper mapper;

    private User user;

    private UserDTO userDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void whenFindByIdThenReturnSucess() {
        Mockito.when(service.findById(Mockito.anyInt())).thenReturn(user);
        Mockito.when(mapper.map(any(), any())).thenReturn(userDTO);

        ResponseEntity<UserDTO> response = resources.findById(ID);
        assertNotNull(response);
        assertNotNull(response.getBody());

        assertEquals(ResponseEntity.class, response.getClass());
        assertEquals(UserDTO.class, response.getBody().getClass());

        assertEquals(ID, response.getBody().getId());
        assertEquals(NOME, response.getBody().getNome());
        assertEquals(EMAIL, response.getBody().getEmail());
        assertEquals(PASSWORD, response.getBody().getPassword());

    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }


    private void startUser(){
        user = new User(ID, NOME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID,NOME,EMAIL, PASSWORD);

    }
}