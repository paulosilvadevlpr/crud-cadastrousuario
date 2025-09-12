package com.paulosilvadev.crud_cadastrousuario.infrastructure.repository;


import com.paulosilvadev.crud_cadastrousuario.infrastructure.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
