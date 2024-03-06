package com.cursoudemy.workshop.config;

import com.cursoudemy.workshop.models.User;
import com.cursoudemy.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", "99999999", "123456");
        User u2 = new User(null, "Alex", "alex@gmail.com", "88888888", "123456");

        userRepository.save(u1);
        userRepository.save(u2);
    }
}
