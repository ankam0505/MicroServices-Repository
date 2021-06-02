package com.onpassive.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpassive.customer.entity.Customer;
import com.onpassive.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public void registerCustomer(Customer customer) {
		
		customerRepository.save(customer);
	}
	
	public List<Customer> listAllCustomers(){
		
		return customerRepository.findAll();
	}
}
