package com.springboot.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
