package com.samuel.veebipood.controller;

import com.samuel.veebipood.entity.Order;
import com.samuel.veebipood.entity.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("categories")
    public List<Order> getOrder(){
        return orderRepository.findAll();
    }

    @GetMapping("categories/{id}")
    public List<Order> deleteOrder(@PathVariable Long id){
        orderRepository.deleteById(id);
        return orderRepository.findAll();
    }

    @PostMapping("categories")
    public List<Order> addOrder(@RequestBody Order order){
        orderRepository.save(order);
        return orderRepository.findAll();
    }
}
}
