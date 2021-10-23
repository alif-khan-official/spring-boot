package com.springboot.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
