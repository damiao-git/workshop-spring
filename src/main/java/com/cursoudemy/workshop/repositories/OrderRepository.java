package com.cursoudemy.workshop.repositories;

import com.cursoudemy.workshop.models.Order;
import com.cursoudemy.workshop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
