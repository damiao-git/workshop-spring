package com.cursoudemy.workshop.services;

import com.cursoudemy.workshop.models.User;
import com.cursoudemy.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }
}
