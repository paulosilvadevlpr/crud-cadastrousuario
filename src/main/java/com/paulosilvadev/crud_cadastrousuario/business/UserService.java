package com.paulosilvadev.crud_cadastrousuario.business;


import com.paulosilvadev.crud_cadastrousuario.infrastructure.entitys.User;
import com.paulosilvadev.crud_cadastrousuario.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user){
        repository.saveAndFlush(user);
    }

    public User findUserByEmail(String email){
        return repository.findByEmail(email).orElseThrow(() ->
                new RuntimeException("Email não encontrado!")
        );
    }

    public void deleteUserByEmail(String email){
        repository.deleteByEmail(email);
    }

    public void updateUserById(Long id, User user){
        User userEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Usuário não encontrado!"));


        User userUpdated = User.builder()
                .birthday(user.getBirthday() != null ?
                        user.getBirthday() : userEntity.getBirthday())
                .name(user.getName() != null ?
                        user.getName() :userEntity.getName())
                .email(user.getEmail() != null ?
                        user.getEmail() : userEntity.getEmail())
                .id(userEntity.getId())
                .build();

        repository.saveAndFlush(userUpdated);
    }
}
