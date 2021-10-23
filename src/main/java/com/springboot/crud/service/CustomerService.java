package com.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.model.Customer;
import com.springboot.crud.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
     
    
    public List<Customer> getAllCustomers()
    {
        return (List<Customer>) customerRepository.findAll();
    }
    
    public void saveCustomer(Customer customer) {
    	customerRepository.save(customer);
    }
}
