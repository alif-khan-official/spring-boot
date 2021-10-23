package com.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.model.Order;
import com.springboot.crud.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
     
    
    public List<Order> getAllOrders()
    {
        return (List<Order>) orderRepository.findAll();
    }
    
    public void saveOrder(Order order) {
    	orderRepository.save(order);
    }
}
