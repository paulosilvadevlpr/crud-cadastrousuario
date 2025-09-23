package com.paulosilvadev.crud_cadastrousuario.controller;


import com.paulosilvadev.crud_cadastrousuario.business.UserService;
import com.paulosilvadev.crud_cadastrousuario.infrastructure.entitys.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> saveUser(@RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<User> findUserByEmail(@RequestParam String email){
        return ResponseEntity.ok(userService.findUserByEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<User> deleteUserByEmail(@RequestParam String email){
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateUserById(@RequestParam Long id,
                                               @RequestBody User user){
        userService.updateUserById(id, user);
        return ResponseEntity.ok().build();
    }
}
