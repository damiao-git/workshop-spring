package com.cursoudemy.workshop.services;

import com.cursoudemy.workshop.models.Order;
import com.cursoudemy.workshop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository OrderRepository;

    public List<Order> getAllOrders(){
        return OrderRepository.findAll();
    }

    public Order getOrderById(Long id){
        Optional<Order> OrderOptional = OrderRepository.findById(id);
        return OrderOptional.get();
    }
}
