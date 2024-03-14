package com.cursoudemy.workshop.config;

import com.cursoudemy.workshop.models.Order;
import com.cursoudemy.workshop.models.User;
import com.cursoudemy.workshop.repositories.OrderRepository;
import com.cursoudemy.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", "99999999", "123456");
        User u2 = new User(null, "Alex", "alex@gmail.com", "88888888", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-06-21T19:53:07Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-06-22T19:53:07Z"), u1);

        userRepository.save(u1);
        userRepository.save(u2);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
