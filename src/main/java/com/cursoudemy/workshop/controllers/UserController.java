package com.cursoudemy.workshop.controllers;

import com.cursoudemy.workshop.models.User;
import com.cursoudemy.workshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    UserService service;
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
       List<User> list = service.getAllUsers();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable(value = "id") Long id){
        User user = service.getUserById(id);
        return ResponseEntity.ok().body(user);
    }
}
