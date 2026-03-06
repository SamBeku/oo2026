package com.samuel.veebipood.controller;

import com.samuel.veebipood.entity.Order;
import com.samuel.veebipood.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("orders")
    public List<Order> getOrder(){
        return orderRepository.findAll();
    }

    @GetMapping("orders/{id}")
    public List<Order> deleteOrder(@PathVariable Long id){
        orderRepository.deleteById(id);
        return orderRepository.findAll();
    }

    @PostMapping("orders")
    public List<Order> addOrder(@RequestBody Order order){
        orderRepository.save(order);
        return orderRepository.findAll();
    }
}
