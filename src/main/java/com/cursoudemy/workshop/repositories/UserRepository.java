package com.cursoudemy.workshop.repositories;

import com.cursoudemy.workshop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
