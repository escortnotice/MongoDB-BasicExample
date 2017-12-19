package com.mongodb.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.example.entity.Customers;
import com.mongodb.example.repository.UserRepository;

@Service
public class CustomerService {

	@Autowired
	UserRepository userRepository;
	
	public void saveCustomer(Customers customer) {
		userRepository.save(customer);
	}
	
	public List<Customers> getAllCustomers(){
		return userRepository.findAll();
	}
}
