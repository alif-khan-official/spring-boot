package com.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.model.Order;
import com.springboot.crud.repository.OrderRepository;

@RestController
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		return (List<Order>) this.orderRepository.findAll();
	} 
	

	@PostMapping("/orders")
	public Order saveItem(@RequestBody Order order) {
	    return this.orderRepository.save(order);
	}
}
