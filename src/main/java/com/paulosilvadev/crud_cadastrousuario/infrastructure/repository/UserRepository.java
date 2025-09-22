package com.paulosilvadev.crud_cadastrousuario.infrastructure.repository;


import com.paulosilvadev.crud_cadastrousuario.infrastructure.entitys.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long> {

    Optional<User>findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}
