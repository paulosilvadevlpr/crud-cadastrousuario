package com.paulosilvadev.crud_cadastrousuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;
import lombok.Builder;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
@Entity
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private LocalDate birthday;

}
