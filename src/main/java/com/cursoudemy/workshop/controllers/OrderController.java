package com.cursoudemy.workshop.controllers;

import com.cursoudemy.workshop.models.Order;
import com.cursoudemy.workshop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    OrderService service;
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders(){
       List<Order> list = service.getAllOrders();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("{id}")
    public ResponseEntity<Order> findById(@PathVariable(value = "id") Long id){
        Order Order = service.getOrderById(id);
        return ResponseEntity.ok().body(Order);
    }
}
