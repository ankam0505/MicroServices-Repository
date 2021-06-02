package com.onpassive.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onpassive.customer.entity.Customer;
import com.onpassive.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public ResponseEntity<?> registerCustomer(@RequestBody Customer customer){
		
		customerService.registerCustomer(customer);
		
		return new ResponseEntity<>("Customerr Detils Saved Successfully", HttpStatus.OK);
	}
	
	@GetMapping("/listCustomers")
	public List<Customer> listAllCustomers(){
		
		return customerService.listAllCustomers();
		
		
	}
}
