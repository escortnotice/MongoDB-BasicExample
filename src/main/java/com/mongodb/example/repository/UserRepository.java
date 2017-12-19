package com.mongodb.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.example.entity.Customers;

public interface UserRepository extends MongoRepository<Customers, Long> {

}
