package com.mongodb.example.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.example.entity.Customers;
import com.mongodb.example.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerService customerService;

	@PostMapping("/customer")
	public void saveCustomer(@RequestBody Customers customer) {
		customerService.saveCustomer(customer);
	}
	
	@GetMapping("/customer/All")
	public @ResponseBody List<Customers> getAllCustomers() {
		return customerService.getAllCustomers();
	}
}
